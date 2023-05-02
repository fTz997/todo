package com.vftz.todo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vftz.todo.domain.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer>{

	@Query("SELECT obj FROM Todo obj WHERE obj.finalizado = false ORDER BY obj.dataFinalizar")
	List<Todo> findAllOpen();

	@Query("SELECT obj FROM Todo obj WHERE obj.finalizado = true ORDER BY obj.dataFinalizar")
	List<Todo> findAllClosed();
	
	@Query("Select obj from Todo obj")
	List<Todo> findAll();
}
