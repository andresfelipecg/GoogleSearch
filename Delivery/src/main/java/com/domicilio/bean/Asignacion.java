package com.domicilio.bean;

public class Asignacion {
	
	private Drone drone=new Drone();
	private Ruta ruta=new Ruta();
	
	public Drone getDrone() {
		return drone;
	}
	public void setDrone(Drone drone) {
		this.drone = drone;
	}
	public Ruta getRuta() {
		return ruta;
	}
	public void setRuta(Ruta ruta) {
		this.ruta = ruta;
	}

}
