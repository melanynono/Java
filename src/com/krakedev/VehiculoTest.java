package com.krakedev;

public class VehiculoTest {

	public static void main(String[] args) {
		
		Vehiculo v;
		
		v = new Vehiculo();
		
		System.out.println("-------Vehiculo 1 : Creado------");
		
		System.out.println("Año: "+ v.anio);
		System.out.println("Marca: "+ v.marca);
		System.out.println("Modelo: "+ v.modelo);
		
		System.out.println("---------Vehiculo 1 : Valores asignados----------");
		
		v.anio = "2020";
		v.marca = "Toyota";
		v.modelo = "Nuevo";
		
		System.out.println("Año: "+ v.anio);
		System.out.println("Marca: "+ v.marca);
		System.out.println("Modelo: "+ v.modelo);	
		
		System.out.println("-------Vehiculo 2 : Creado------");
		
		Vehiculo v2 = new Vehiculo();
		
		System.out.println("Año: "+ v2.anio);
		System.out.println("Marca: "+ v2.marca);
		System.out.println("Modelo: "+ v2.modelo);
		
        System.out.println("---------Vehiculo 2 : Valores asignados----------");
		
		v2.anio = "2022";
		v2.marca = "Chevrolet";
		v2.modelo = "Onix";
		
		System.out.println("Año: "+ v2.anio);
		System.out.println("Marca: "+ v2.marca);
		System.out.println("Modelo: "+ v2.modelo);

	}

}
