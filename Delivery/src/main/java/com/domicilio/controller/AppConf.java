package com.domicilio.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.domicilio.bean.Asignacion;

@Configuration
public class AppConf {
	
	@Bean
	Asignacion asignacion() {
		return new Asignacion();
	}

}
