package com.domicilio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.domicilio.bean.Asignacion;
import com.domicilio.service.Movimiento;
import com.domicilio.util.FileCreator;
import com.domicilio.util.FileParser;


/*@Author: Andres Felipe Cuero
 * 
 * 2:llamar al metodo fp.leer() con la utilidad de leer archivos de entrada  in.txt, haciendo casteo 
 * de la lista que tiene los movimientos a arreglos de String, cada valor del arreglo es una orden 
 *  a entregar, para despues pasar a la logica de negocio y descomponer con un foreach los caracteres 
 *  que compone un valor del arreglo  y obtener los movimientos, adelante, derecha e izquierda
 *
 *3: Actualizar posicion del drone con el servicio Movimiento.posicion() y en cada iteraccion 
 * (cada entrega a realizar) actualizar posicion y registrarla en el reporte del drone.
 * 
 * */

@Component
@Scope("prototype")
public class DeliveryThread extends Thread {
	
	Asignacion asignacion;
	FileParser parser;
	FileCreator creator;
	
	@Autowired
	public DeliveryThread(Asignacion a, FileParser fp, FileCreator fc) {
		
		this.asignacion = a;
		this.parser = fp;
		this.creator = fc;
	}


	@Override
	public void run() {
		
		 asignacion.getRuta().setMovimientos(parser.leer(asignacion.getDrone().getId()).stream().toArray(String[]::new)); 
		 asignacion=Movimiento.posicion(asignacion);
		  creator.escribir(asignacion);
		
	}

}
