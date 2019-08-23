package com.domicilio.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.domicilio.bean.Asignacion;

public class FileCreator {
	
	private String rutaEscritura;
	private String archivoOut;
	
	File f=null;
	FileWriter fw=null;
	PrintWriter pw=null;
	
	public void escribir(Asignacion a) {
		
		try {
			
			//fw=new FileWriter(rutaEscritura+archivoOut);
			f=new File(rutaEscritura+archivoOut);
			f.setWritable(true);
            f.setReadable(true);
			fw=new FileWriter(f);
			pw=new PrintWriter(fw);
			
			pw.println("== Reporte de entregas ==");
			
			
			
			for(String linea:a.getDrone().getReporte()) {
				
				pw.println(linea);
			}
			
			System.out.println("\nRefrescar proyecto y buscar archivos out.txt en "+rutaEscritura+" "
					+ "o en la ruta absoluta "+f.getAbsolutePath());
			
		}catch(IOException e) {e.printStackTrace();}
		
		finally {
			if (null != fw)
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

	public String getArchivoOut() {
		return archivoOut;
	}

	public void setArchivoOut(String archivoOut) {
		this.archivoOut = archivoOut;
	}

	public String getRutaEscritura() {
		return rutaEscritura;
	}

	public void setRutaEscritura(String rutaEscritura) {
		this.rutaEscritura = rutaEscritura;
	}
	
	

}
