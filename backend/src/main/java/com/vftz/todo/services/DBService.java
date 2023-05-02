package com.vftz.todo.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vftz.todo.domain.Todo;
import com.vftz.todo.repositories.TodoRepository;

@Service
public class DBService {

	@Autowired
	private TodoRepository todoRepo;

	public void instanciaBaseDados() throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		//Todo t = new Todo(null, "Estudar", "Spring boot",sdf.parse("17/04/2023"), false);
		//Todo t1 = new Todo(null, "Acordar", "", sdf.parse("17/04/2023"), true);
		//Todo t2 = new Todo(null, "Academia", "Treino de costas", sdf.parse("17/04/2023"), false);

		//todoRepo.saveAll(Arrays.asList(t, t1, t2));

	}
}
