package com.krakedev;

public class Rectangulo {
	
	private int base;
	private int altura;
	private int base1;
	private int altura1;
	
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

	
	
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getBase1() {
		return base1;
	}

	public void setBase1(int base1) {
		this.base1 = base1;
	}

	public int getAltura1() {
		return altura1;
	}

	public void setAltura1(int altura1) {
		this.altura1 = altura1;
	}
	
	

}
