package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		
		Rectangulo r1 = new Rectangulo();
		
		r1.setAltura(4);
		r1.setBase(5);
		
		int resultadoArea;
		resultadoArea = r1.calcularArea();
		System.out.println("Resultado: "+ resultadoArea);
		
		Rectangulo r2 = new Rectangulo();
		int resultadoArea2;
		
		r2.setAltura(8);
		r2.setBase(2);
		
		resultadoArea2 = r2.calcularArea();
		System.out.println("Resultado rectangulo 2: "+ resultadoArea2);
		
		
		Rectangulo p = new Rectangulo();
		double resultadoPerimetro;
		
		p.setBase1(4);
		p.setAltura1(2);

		resultadoPerimetro= p.calcularPerimetro();
		System.out.println("El perimetro es : "+ resultadoPerimetro);

	}

}
