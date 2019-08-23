package com.domicilio.bean;


import java.util.ArrayList;
import java.util.List;

import com.domicilio.bean.Almuerzo;

public class Drone {
	
	private int id;
	private Location location;
	private List<String> reporte=new ArrayList<String>();
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public List<String> getReporte() {
		return reporte;
	}
	public void addReporte(String reporte) {
		this.reporte.add(reporte);
	}
	
	
	
	

}
