package com.krakedev;

public class TestRestaurante {

	public static void main(String[] args) {
		
        Restaurante rest1 = new Restaurante("McDonald's", "Centro Comercial Portal", 4.3);
		
		System.out.println("--------Restaurante 1---------");
		
		System.out.println("Nombre: " + rest1.getNombre());
		System.out.println("Direccion: " + rest1.getDireccion());
		System.out.println("Calificacion: " + rest1.getCalificacion());
		
		Restaurante rest2 = new Restaurante("Las menestras del Negro", "Av 6 Diciembre",4.4);
        System.out.println("--------Restaurante 2---------");
		
		System.out.println("Nombre: " + rest2.getNombre());
		System.out.println("Direccion: " + rest2.getDireccion());
		System.out.println("Calificacion: " + rest2.getCalificacion());


	}

}
