package com.domicilio.bean;

import java.util.LinkedList;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Location {

private int coordenadaX;
private int coordenadaY;
private String puntoCardinalInicial; //punto cardinal inicial
private LinkedList<String> orientacion=new LinkedList<String>();



public Location() {
	super();
	
	this.orientacion.add(0,"dirección Norte");
	this.orientacion.add(1,"dirección Este");
	this.orientacion.add(2,"dirección Sur");
	this.orientacion.add(3,"dirección Oeste");
}

public int getCoordenadaX() {
	return coordenadaX;
}
public void setCoordenadaX(int coordenadaX) {
	this.coordenadaX = coordenadaX;
}
public int getCoordenadaY() {
	return coordenadaY;
}
public void setCoordenadaY(int coordenadaY) {
	this.coordenadaY = coordenadaY;
}
public String getPuntoCardinalInicial() {
	return puntoCardinalInicial;
}
public void setPuntoCardinalInicial(String puntoCardinal) {
	this.puntoCardinalInicial = puntoCardinal;
}

public LinkedList<String> getOrientacion() {
	return orientacion;
}

public void setOrientacion(LinkedList<String> orientacion) {
	this.orientacion = orientacion;
}

@Override
public String toString() {
	return "("+coordenadaX+","+coordenadaY+") "+puntoCardinalInicial;
}


	
}
