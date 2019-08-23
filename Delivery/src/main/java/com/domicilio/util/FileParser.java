package com.domicilio.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileParser {
	
	private String rutaLectura;
	private String archivoIn;
	private List<String> resultado=new ArrayList<String>();
	
	
	static File archivo=null;
	static FileReader fr=null;
	static BufferedReader br=null;
	
	
	
	public List<String> leer(){
		
		try {
			//archivo= new File (rutaLectura+archivoIn);
			archivo= new File (getClass().getClassLoader().getResource(archivoIn).getFile());
			fr= new FileReader(archivo);
			br= new BufferedReader(fr);
			
			String linea;
	         while((linea=br.readLine())!=null)
	        	 
	        	 
	        	 addResultado(linea);
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		finally {
		
		
		}
		return resultado;
	}
	
	

	public String getRutaLectura() {
		return rutaLectura;
	}

	public void setRutaLectura(String rutaLectura) {
		this.rutaLectura = rutaLectura;
	}



	public String getArchivoIn() {
		return archivoIn;
	}



	public void setArchivoIn(String archivoIn) {
		this.archivoIn = archivoIn;
	}



	public List<String> getResultado() {
		return resultado;
	}



	public void addResultado(String resultado) {
		this.resultado.add(resultado);
	}
	
	
	
}
