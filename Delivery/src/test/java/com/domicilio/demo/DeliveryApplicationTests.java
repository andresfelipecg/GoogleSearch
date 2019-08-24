package com.domicilio.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.domicilio.bean.Asignacion;
import com.domicilio.service.Movimiento;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DeliveryApplicationTests {

	/*Convencion de salida esperada de acuerdo a prueba de escritorio es:
	 * 
	 * (X,Y) dirección Norte
	 * (X,Y) dirección Este
	 * (X,Y) dirección Sur
	 * (X,Y) dirección Sur
	 * 
	 * donde X y Y pueden tener valores tanto positivos como negativos
	 * 
	 * */
	
	static String entrada="AAAAIAAD";
	static String salidaEsperada="(-2,4) dirección Norte";
	public static char[] pasos;
	Asignacion a;
	
	@Before
	public void contextLoads() {
		
        ApplicationContext appContext=new ClassPathXmlApplicationContext("com/domicilio/xml/Beans.xml");
		 a=(Asignacion) appContext.getBean("asignacion");
	
	}
	
	
	  @Test
	  public void testSalidas() {
		  
		  pasos=entrada.toCharArray();
		  for(char c:pasos) {
				//System.out.println("Los pasos son "+c);
				 
				switch(c) {
					case 'A': //Adelante
						a=Movimiento.adelante(a);
						break;
					case 'D': //giro a la derecha
						a=Movimiento.derecha(a);
						break;
					case 'I': //giro a la izquierda
						a=Movimiento.izquierda(a);
						break;
				} 
	  }
		 
				
		  assertEquals(salidaEsperada,a.getDrone().getLocation().toString());
		 
	  }

}

