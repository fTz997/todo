package com.vftz.todo.configuration;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.vftz.todo.services.DBService;

@Configuration
@Profile("test")
public class TesteConf {
	
	@Autowired
	public DBService dbservice;

    @Bean
    boolean instancia() throws ParseException{
		this.dbservice.instanciaBaseDados();
		return true;
	}
}
