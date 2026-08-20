package com.krakedev;

public class Rectangulo {
	
	public int base;
	public int altura;
	public int base1;
	public int altura1;
	
	public int calcularArea() {
		
		int area = base * altura;
		
		return area;
		
	}
	
	public double calcularPerimetro() {
		
		int base = base1 * 2;
		int altura = altura1 * 2;
		
		double perimetro = base + altura;
		
		return perimetro;
		
	}

}
