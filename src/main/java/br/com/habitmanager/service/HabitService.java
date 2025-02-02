package br.com.habitmanager.service;

import br.com.habitmanager.model.Habit;
import br.com.habitmanager.repository.HabitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HabitService {

    @Autowired
    private HabitRepository habitRepository;

    public List<Habit> getAllHabits() {
        return habitRepository.findAll();
    }

    public Optional<Habit> getHabitById(Long id) {
        return habitRepository.findById(id);
    }

    public Habit createHabit(Habit habito) {
        return habitRepository.save(habito);
    }

    public Habit updateHabit(Long id, Habit habitDetails) {
        Habit habit = habitRepository.findById(id).orElseThrow(() -> new RuntimeException("Hábito não encontrado"));

        habit.setNome(habitDetails.getNome());
        habit.setDescricao(habitDetails.getDescricao());
        habit.setDataInicial(habitDetails.getDataInicial());
        habit.setDataFinal(habitDetails.getDataFinal());
        habit.setCompleto(habitDetails.isCompleto());

        return habitRepository.save(habit);
    }

    public void deleteHabit(Long id) {
        habitRepository.deleteById(id);
    }
}
