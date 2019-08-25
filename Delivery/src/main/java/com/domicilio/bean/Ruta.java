package com.domicilio.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Ruta {

	
	private int id;
	private String[] movimientos;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String[] getMovimientos() {
		return movimientos;
	}
	public void setMovimientos(String[] movimientos) {
		this.movimientos = movimientos;
	}
	
	
}
