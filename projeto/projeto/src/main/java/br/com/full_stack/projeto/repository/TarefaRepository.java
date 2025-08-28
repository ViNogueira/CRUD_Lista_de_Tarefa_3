package br.com.full_stack.projeto.repository;

import br.com.full_stack.projeto.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
