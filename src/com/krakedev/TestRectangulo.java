package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		
		Rectangulo r1 = new Rectangulo();
		
		r1.altura = 4;
		r1.base = 5;
		
		int resultadoArea;
		resultadoArea = r1.calcularArea();
		System.out.println("Resultado: "+ resultadoArea);
		
		Rectangulo r2 = new Rectangulo();
		int resultadoArea2;
		
		r2.altura = 8;
		r2.base = 2;
		
		resultadoArea2 = r2.calcularArea();
		
		System.out.println("Resultado ectangulo 2: "+ resultadoArea2);

	}

}
