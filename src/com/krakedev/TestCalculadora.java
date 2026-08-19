package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		
		Calculadora c1 = new Calculadora();
		
		int r1;
		int r2;
		double r3;
		double r4;
		
		r1 = c1.sumar(5, 8);
		
		System.out.println("El resultado de la suma es: "+r1);
		
		r2 = c1.restar(10, 4);
		System.out.println("El resulatdo de la resta es: "+ r2);
		
		r3 = c1.multiplicar(4.5, 5.5);
		System.out.println("El resulatdo de la resta es: "+ r3);
		
		r4 = c1.dividir(25.0, 4.5);
		System.out.println("El resulatdo de la resta es: "+ r4);
		

	}

}
