package com.domicilio.service;

import com.domicilio.bean.Asignacion;
import com.domicilio.bean.Drone;
import com.domicilio.util.CollectionNextPrevItem;


/*@Author: Andres Felipe Cuero
 * 
 * 1:Se recibe un objeto asignacion con un drone y unas entregas
 * 
 * 2:Se evalua entrega por entrega y se descompone en pasos, caracteres AD e I, los demas se ignoran
 * 
 * 3:Cada paso entra en un case que llama una operacion, o ir adelante, o girar a dercha o izquierda
 * 
 * 4: Al final de evaluar cada entrega, se escribe el reporte en un atributo del Drone y se devuelve
 * 
 * 
 * */

public class Movimiento {

	public static char[] pasos;
	
	
	public static Asignacion posicion(Asignacion a) {
		
		try {
		
		for(String m:a.getRuta().getMovimientos()) {
		//System.out.println("Entro a movimiento.posicion "+m);
		
		pasos=m.toCharArray();
		
		for(char c:pasos) {
		//System.out.println("Los pasos son "+c);
		
		switch(c) {
			case 'A': //Adelante
				a=adelante(a);
				break;
			case 'D': //giro a la derecha
				a=derecha(a);
				break;
			case 'I': //giro a la izquierda
				a=izquierda(a);
				break;
		}
		
		}

		if(null !=a.getDrone().getLocation() )
		a.getDrone().addReporte(a.getDrone().getLocation().toString());
		
		}
		
		//Salida por consola de resultado de entregas
		
		System.out.println("== Reporte de entregas ==");
		for(String r:a.getDrone().getReporte()) {
			System.out.println(r);
		}
		
		}
		
		catch(Exception e) {
			
		}
		
		finally {
		
		}
		return a;
	}
	
	
	public static Asignacion adelante(Asignacion a) {
		
		int operacion = a.getDrone().getLocation().getOrientacion().indexOf(a.getDrone().getLocation().getPuntoCardinalInicial());
		
		int tempX=0;
		int tempY=0;
		
		try {
		switch(operacion) {
		case 0:  //dirección Norte suma a Y
		    tempY=a.getDrone().getLocation().getCoordenadaY();
         	tempY+=1;
		    a.getDrone().getLocation().setCoordenadaY(tempY);
		    
			break;
			
		case 1://dirección Este suma a X
			 tempX=a.getDrone().getLocation().getCoordenadaX();
			 tempX+=1;
			 a.getDrone().getLocation().setCoordenadaX(tempX);
			break;
			
		case 2://dirección Sur resta a Y
		 	tempY=a.getDrone().getLocation().getCoordenadaY();
         	tempY-=1;
		    a.getDrone().getLocation().setCoordenadaY(tempY);
		    
			break;
			
		case 3://dirección Oeste resta a X
			tempX=a.getDrone().getLocation().getCoordenadaX();
			 tempX-=1;
			 a.getDrone().getLocation().setCoordenadaX(tempX);
			break;
		
		}
		}catch(Exception e) {e.printStackTrace();}
		
		finally {}
		return a;
		
	}
	
	
	//CollectionNextPrevItem es una utilidad para poder recorrer circularmente los piuntos cardinales
	
	public static Asignacion derecha(Asignacion a) {
		
   a.getDrone().getLocation().setPuntoCardinalInicial(CollectionNextPrevItem.getNext
	(a.getDrone().getLocation().getOrientacion(), a.getDrone().getLocation().getPuntoCardinalInicial(),true));
   return a;
	}
	
	public static Asignacion izquierda(Asignacion a) {
		
	a.getDrone().getLocation().setPuntoCardinalInicial(CollectionNextPrevItem.getPrevious
	(a.getDrone().getLocation().getOrientacion(), a.getDrone().getLocation().getPuntoCardinalInicial(),true));
	return a;
	}
	 
	
}
