package com.krakedev;

public class Calculadora {
	
	public int sumar(int a, int b) {
		
		int resultado;
		resultado = a + b;
		
		return resultado;
		
	}
	
	public double restar(double a, double b) {
		
		double resultado;
		resultado = a - b;
		
		return resultado;
		
	}
	
    public double multiplicar(double a, double b) {
		
		double resultado;
		resultado = a * b;
		
		return resultado;
		
	}
    
    public double dividir(double a, double b) {
		
		double resultado;
		resultado = a / b;
		
		return resultado;
		
	}
    
    public double promedio(double a, double b, double c) {
    	
    	double sumar;
    	double resultado;
    	
    	sumar = a + b + c ;
    	resultado = sumar / 3;
    	
    	return resultado;
    	
    }
    
    public void mostrarResultado() {
    	
    	System.out.println("Ahorita no joven, Salí al almuerzo. Regreso en 15 minutos");
    	
    }
    
    public double calclarDescuento(double precio, double descuento) {
    	
    	double resultado;
    	resultado = precio - (precio * descuento / 100);
    	
    	return resultado;
    	
    	
    }
}
