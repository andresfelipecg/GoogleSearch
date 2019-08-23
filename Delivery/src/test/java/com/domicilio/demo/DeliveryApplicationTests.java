package com.domicilio.demo;

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

	@Test
	public void contextLoads() {
		
        ApplicationContext appContext=new ClassPathXmlApplicationContext("com/domicilio/xml/Beans.xml");
		Asignacion a=(Asignacion) appContext.getBean("asignacion");
		
		String s1="AAAAIAAD";
		String s2="DDAIAD";
		String s3="AAIADAD";
       
		String[] pasopasos= {s1,s2,s3};//,s2,s3
		
		a.getRuta().setMovimientos(pasopasos); 
		a=Movimiento.posicion(a);
	}

}
