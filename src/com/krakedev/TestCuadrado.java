package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		
		System.out.println("---Cuadrado 1---");
		Cuadrado c1 = new Cuadrado();
		c1.lado = 5;
		double area;
		double perimetro;
		area = c1.calcularArea();
		perimetro = c1.calcularPerimetro();
		
		System.out.println("Lado: " +c1.lado);
		System.out.println("Area: "+ area);
		System.out.println("Perimetro: "+ perimetro);
		
        System.out.println("---Cuadrado 2---");
		Cuadrado c2 = new Cuadrado();
		c2.lado = 9;
		double area2;
		double perimetro2;
		area2 = c2.calcularArea();
		perimetro2 = c2.calcularPerimetro();
		
		System.out.println("Lado: " +c2.lado);
		System.out.println("Area: "+ area2);
		System.out.println("Perimetro: "+ perimetro2);
		
        System.out.println("---Cuadrado 3---");
		Cuadrado c3 = new Cuadrado();
		c3.lado = 12;
		double area3;
		double perimetro3;
		area3 = c3.calcularArea();
		perimetro3 = c3.calcularPerimetro();
		
		System.out.println("Lado: " +c3.lado);
		System.out.println("Area: "+ area3);
		System.out.println("Perimetro: "+ perimetro3);
		



	}

}
