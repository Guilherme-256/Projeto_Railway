package edu.dio.final_project.repository;

import edu.dio.final_project.model.Tarefa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
    List<Tarefa> findByAtribuidoA(String atribuidoA);
}
