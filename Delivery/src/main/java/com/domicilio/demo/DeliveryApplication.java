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
import com.domicilio.controller.DeliveryThread;
import com.domicilio.util.CollectionNextPrevItem;
import com.domicilio.util.FileCreator;
import com.domicilio.util.FileParser;
import com.domicilio.service.Movimiento;

@SpringBootApplication
public class DeliveryApplication {
	
	 
	/*@Author:Andres Felipe Cuero
	 * 
	 * 1:Obtener beans de inicio de la asignacion, una asignacion tiene un drone y entregas.
	 * 
	 * 2:Crear y lanzar hilos
	 * 
	 * */
	
	public static void main(String[] args) {
		//SpringApplication.run(DeliveryApplication.class, args);
		
		try {
	  //ApplicationContext appContext=new AnnotationConfigApplicationContext(AppConf.class);	
	    ApplicationContext appContext=new ClassPathXmlApplicationContext("com/domicilio/xml/Beans.xml");
		
	   
		Asignacion asignacion1=(Asignacion) appContext.getBean("asignacion");
		FileParser parser1= (FileParser) appContext.getBean("fileparser");   
		FileCreator creator1= (FileCreator) appContext.getBean("filecreator");
		
		Asignacion asignacion2=(Asignacion) appContext.getBean("asignacion");
		FileParser parser2= (FileParser) appContext.getBean("fileparser");   
		FileCreator creator2= (FileCreator) appContext.getBean("filecreator");
		
		Asignacion asignacion3=(Asignacion) appContext.getBean("asignacion");
		FileParser parser3= (FileParser) appContext.getBean("fileparser");   
		FileCreator creator3= (FileCreator) appContext.getBean("filecreator");
		
		Asignacion asignacion4=(Asignacion) appContext.getBean("asignacion");
		FileParser parser4= (FileParser) appContext.getBean("fileparser");   
		FileCreator creator4= (FileCreator) appContext.getBean("filecreator");
		
		Asignacion asignacion5=(Asignacion) appContext.getBean("asignacion");
		FileParser parser5= (FileParser) appContext.getBean("fileparser");   
		FileCreator creator5= (FileCreator) appContext.getBean("filecreator");
		
		Asignacion asignacion6=(Asignacion) appContext.getBean("asignacion");
		FileParser parser6= (FileParser) appContext.getBean("fileparser");   
		FileCreator creator6= (FileCreator) appContext.getBean("filecreator");
		
		Asignacion asignacion7=(Asignacion) appContext.getBean("asignacion");
		FileParser parser7= (FileParser) appContext.getBean("fileparser");   
		FileCreator creator7= (FileCreator) appContext.getBean("filecreator");
		
		Asignacion asignacion8=(Asignacion) appContext.getBean("asignacion");
		FileParser parser8= (FileParser) appContext.getBean("fileparser");   
		FileCreator creator8= (FileCreator) appContext.getBean("filecreator");
		
		Asignacion asignacion9=(Asignacion) appContext.getBean("asignacion");
		FileParser parser9= (FileParser) appContext.getBean("fileparser");   
		FileCreator creator9= (FileCreator) appContext.getBean("filecreator");
		
		Asignacion asignacion10=(Asignacion) appContext.getBean("asignacion");
		FileParser parser10= (FileParser) appContext.getBean("fileparser");   
		FileCreator creator10= (FileCreator) appContext.getBean("filecreator");
		
		Asignacion asignacion11=(Asignacion) appContext.getBean("asignacion");
		FileParser parser11= (FileParser) appContext.getBean("fileparser");   
		FileCreator creator11= (FileCreator) appContext.getBean("filecreator");
		
		Asignacion asignacion12=(Asignacion) appContext.getBean("asignacion");
		FileParser parser12= (FileParser) appContext.getBean("fileparser");   
		FileCreator creator12= (FileCreator) appContext.getBean("filecreator");
		
		Asignacion asignacion13=(Asignacion) appContext.getBean("asignacion");
		FileParser parser13= (FileParser) appContext.getBean("fileparser");   
		FileCreator creator13= (FileCreator) appContext.getBean("filecreator");
		
		Asignacion asignacion14=(Asignacion) appContext.getBean("asignacion");
		FileParser parser14= (FileParser) appContext.getBean("fileparser");   
		FileCreator creator14= (FileCreator) appContext.getBean("filecreator");
		
		Asignacion asignacion15=(Asignacion) appContext.getBean("asignacion");
		FileParser parser15= (FileParser) appContext.getBean("fileparser");   
		FileCreator creator15= (FileCreator) appContext.getBean("filecreator");
		
		Asignacion asignacion16=(Asignacion) appContext.getBean("asignacion");
		FileParser parser16= (FileParser) appContext.getBean("fileparser");   
		FileCreator creator16= (FileCreator) appContext.getBean("filecreator");
		
		Asignacion asignacion17=(Asignacion) appContext.getBean("asignacion");
		FileParser parser17= (FileParser) appContext.getBean("fileparser");   
		FileCreator creator17= (FileCreator) appContext.getBean("filecreator");
		
		Asignacion asignacion18=(Asignacion) appContext.getBean("asignacion");
		FileParser parser18= (FileParser) appContext.getBean("fileparser");   
		FileCreator creator18= (FileCreator) appContext.getBean("filecreator");
		
		Asignacion asignacion19=(Asignacion) appContext.getBean("asignacion");
		FileParser parser19= (FileParser) appContext.getBean("fileparser");   
		FileCreator creator19= (FileCreator) appContext.getBean("filecreator");
		
		Asignacion asignacion20=(Asignacion) appContext.getBean("asignacion");
		FileParser parser20= (FileParser) appContext.getBean("fileparser");   
		FileCreator creator20= (FileCreator) appContext.getBean("filecreator");
		
		asignacion1.getDrone().setId("01");
	    asignacion2.getDrone().setId("02");
	    asignacion3.getDrone().setId("03");
		asignacion4.getDrone().setId("04");
	    asignacion5.getDrone().setId("05");
	    asignacion6.getDrone().setId("06");
		asignacion7.getDrone().setId("07");
	    asignacion8.getDrone().setId("08");
	    asignacion9.getDrone().setId("09");
		asignacion10.getDrone().setId("10");
	    asignacion11.getDrone().setId("11");
	    asignacion12.getDrone().setId("12");
		asignacion13.getDrone().setId("13");
	    asignacion14.getDrone().setId("14");
	    asignacion15.getDrone().setId("15");
		asignacion16.getDrone().setId("16");
	    asignacion17.getDrone().setId("17");
	    asignacion18.getDrone().setId("18");
		asignacion19.getDrone().setId("19");
	    asignacion20.getDrone().setId("20");
        
		DeliveryThread thread1= new DeliveryThread(asignacion1, parser1, creator1);
	    DeliveryThread thread2= new DeliveryThread(asignacion2, parser2, creator2);
	    DeliveryThread thread3= new DeliveryThread(asignacion3, parser3, creator3);
	    DeliveryThread thread4= new DeliveryThread(asignacion4, parser4, creator4);
	    DeliveryThread thread5= new DeliveryThread(asignacion5, parser5, creator5);
	    DeliveryThread thread6= new DeliveryThread(asignacion6, parser6, creator6);
	    DeliveryThread thread7= new DeliveryThread(asignacion7, parser7, creator7);
	    DeliveryThread thread8= new DeliveryThread(asignacion8, parser8, creator8);
	    DeliveryThread thread9= new DeliveryThread(asignacion9, parser9, creator9);
	    DeliveryThread thread10= new DeliveryThread(asignacion10, parser10, creator10);
	    DeliveryThread thread11= new DeliveryThread(asignacion11, parser11, creator11);
	    DeliveryThread thread12= new DeliveryThread(asignacion12, parser12, creator12);
	    DeliveryThread thread13= new DeliveryThread(asignacion13, parser13, creator13);
	    DeliveryThread thread14= new DeliveryThread(asignacion14, parser14, creator14);
	    DeliveryThread thread15= new DeliveryThread(asignacion15, parser15, creator15);
	    DeliveryThread thread16= new DeliveryThread(asignacion16, parser16, creator16);
	    DeliveryThread thread17= new DeliveryThread(asignacion17, parser17, creator17);
	    DeliveryThread thread18= new DeliveryThread(asignacion18, parser18, creator18);
	    DeliveryThread thread19= new DeliveryThread(asignacion19, parser19, creator19);
	    DeliveryThread thread20= new DeliveryThread(asignacion20, parser20, creator20);
	
	    
		thread1.start();
		thread1.sleep(50);
		thread2.start();
		thread2.sleep(50);
	    thread3.start();
	    thread3.sleep(50);
	    thread4.start();
		thread4.sleep(50);
		thread5.start();
		thread5.sleep(50);
	    thread6.start();
	    thread6.sleep(50);
	    thread7.start();
		thread7.sleep(50);
		thread8.start();
		thread8.sleep(50);
	    thread9.start();
	    thread9.sleep(50);
	    thread10.start();
		thread10.sleep(50);
		thread11.start();
		thread11.sleep(50);
	    thread12.start();
	    thread12.sleep(50);
	    thread13.start();
		thread13.sleep(50);
		thread14.start();
		thread14.sleep(50);
	    thread15.start();
	    thread15.sleep(50);
	    thread16.start();
		thread16.sleep(50);
		thread17.start();
		thread17.sleep(50);
	    thread18.start();
	    thread18.sleep(50);
	    thread19.start();
		thread19.sleep(50);
		thread20.start();
		thread20.sleep(50);
		
	 
		
		
	   ((ConfigurableApplicationContext)appContext).close();
			
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		
		finally {
		
	
		}
		} 
		
		
	}
	


