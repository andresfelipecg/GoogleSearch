package com.domicilio.bean;


import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.domicilio.bean.Almuerzo;

@Component
@Scope("prototype")
public class Drone {
	
	private String id;
	private Location location;
	private List<String> reporte=new ArrayList<String>();
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
