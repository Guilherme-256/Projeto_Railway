package edu.dio.final_project.service;

import edu.dio.final_project.model.Tarefa;
import edu.dio.final_project.repository.TarefaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository tarefaRepository;

    public List<Tarefa> getAllTarefas() {
        return tarefaRepository.findAll();
    }

    public Optional<Tarefa> getTarefaById(Long id) {
        return tarefaRepository.findById(id);
    }

    public Tarefa saveTarefa(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    public void deleteTarefa(Long id) {
        if (tarefaRepository.existsById(id)) {
            tarefaRepository.deleteById(id);
        }else{
            throw new NoSuchElementException();
        }

    }

    public Tarefa updateTarefa(Long id, Tarefa tarefaDetails) {
        Tarefa tarefa = tarefaRepository.findById(id).orElseThrow();
        tarefa.setConcluida(tarefaDetails.isConcluida());
        return tarefaRepository.save(tarefa);
    }

    public List<Tarefa> getTarefasByAtribuidoA(String atribuidoA) {
        return Optional.ofNullable(tarefaRepository.findByAtribuidoA(atribuidoA)).orElseThrow(() -> new NoSuchElementException("This name does not exist"));
    }
}
