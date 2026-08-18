package com.krakedev;

public class TestRestaurante {

	public static void main(String[] args) {
		
        Restaurante rest1 = new Restaurante();
		
		System.out.println("--------Restaurante 1---------");
		
		System.out.println("Nombre: " + rest1.nombre);
		System.out.println("Direccion: " + rest1.direccion);
		System.out.println("Calificacion: " + rest1.calificacion);
		
		rest1.nombre = "McDonald's";
		rest1.direccion = "Centro Comercial Portal";
		rest1.calificacion = 4.3;
		
		System.out.println("Nombre: " + rest1.nombre);
		System.out.println("Direccion: " + rest1.direccion);
		System.out.println("Calificacion: " + rest1.calificacion);
		
		Restaurante rest2 = new Restaurante();
        System.out.println("--------Restaurante 2---------");
		
		System.out.println("Nombre: " + rest2.nombre);
		System.out.println("Direccion: " + rest2.direccion);
		System.out.println("Calificacion: " + rest2.calificacion);
		
		rest2.nombre = "Las menestras del Negro";
		rest2.direccion = "Av 6 Diciembre";
		rest2.calificacion = 4.4;
		
		System.out.println("Nombre: " + rest2.nombre);
		System.out.println("Direccion: " + rest2.direccion);
		System.out.println("Calificacion: " + rest2.calificacion);


	}

}
