package com.domicilio.demo;

import java.io.ObjectInputStream.GetField;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.domicilio.bean.Asignacion;
import com.domicilio.bean.Location;
import com.domicilio.controller.AppConf;
import com.domicilio.util.CollectionNextPrevItem;
import com.domicilio.util.FileCreator;
import com.domicilio.util.FileParser;
import com.domicilio.service.Movimiento;

@SpringBootApplication
public class DeliveryApplication {
	
	 
	/*@Author:Andres Felipe Cuero
	 * 
	 * 1:Obtener bean de inicio de la asignacion, una asignacion tiene un drone y entregas.
	 * 
	 * 2:llamar al metodo fp.leer() con la utilidad de leer archivos de entrada  in.txt, haciendo casteo 
	 *  de la lista que tiene los movimientos a arreglos de String, cada valor del arreglo es una orden 
	 *  a entregar, para despues pasar a la logica de negocio y descomponer con un foreach los caracteres 
	 *  que compone un valor del arreglo  y obtener los movimientos, adelante, derecha e izquierda
     *
     *3: Actualizar posicion del drone con el servicio Movimiento.posicion() y en cada iteraccion 
     * (cada entrega a realizar) actualizar posicion y registrarla en el reporte del drone.
	 * 
	 * */
	
	public static void main(String[] args) {
		//SpringApplication.run(DeliveryApplication.class, args);
		
		try {
	  //ApplicationContext appContext=new AnnotationConfigApplicationContext(AppConf.class);	
	    ApplicationContext appContext=new ClassPathXmlApplicationContext("com/domicilio/xml/Beans.xml");
		
		Asignacion a=(Asignacion) appContext.getBean("asignacion");
		FileParser fp= (FileParser) appContext.getBean("fileparser");   
		FileCreator fc= (FileCreator) appContext.getBean("filecreator");
		
	    a.getRuta().setMovimientos(fp.leer().stream().toArray(String[]::new)); 
	    a=Movimiento.posicion(a);
		fc.escribir(a);
		
		
	   ((ConfigurableApplicationContext)appContext).close();
			
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		finally {
		
	
		}
		} 
		
		
	}
	


