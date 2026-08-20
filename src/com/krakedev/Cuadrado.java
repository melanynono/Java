package com.krakedev;

public class Cuadrado {
	
	public int lado;
	
	public double calcularArea() {
		
		int area = lado * lado;
		
		return area;
		
	}
	
	public double calcularPerimetro() {
		
		int perimetro = lado * 4;
		
		return perimetro;
		
	}

}

