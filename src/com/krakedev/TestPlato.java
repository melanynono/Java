package com.krakedev;

public class TestPlato {

	public static void main(String[] args) {
		
		Plato platoA = new Plato();
		
		System.out.println("=======Plato A========");
		System.out.println("Nombre: "+ platoA.nombre);
		System.out.println("Tipo: "+ platoA.tipo);
		System.out.println("Precio: "+ platoA.precio);
		System.out.println("Disponible: "+ platoA.disponible);
		
		platoA.nombre = "Coctel de camarones";
		platoA.tipo = "Entrada";
		platoA.precio = 6.5;
		platoA.disponible = true;
		
		Plato platoB = new Plato();
		
		System.out.println("=======Plato B========");
		System.out.println("Nombre: "+ platoB.nombre);
		System.out.println("Tipo: "+ platoB.tipo);
		System.out.println("Precio: "+ platoB.precio);
		System.out.println("Disponible: "+ platoB.disponible);
		
		platoB.nombre = "Arroz marinero";
		platoB.tipo = "Plato fuerte";
		platoB.precio = 15.00;
		platoB.disponible = true;
		
		Plato platoC = new Plato();
		
		System.out.println("=======Plato C========");
		System.out.println("Nombre: "+ platoC.nombre);
		System.out.println("Tipo: "+ platoC.tipo);
		System.out.println("Precio: "+ platoC.precio);
		System.out.println("Disponible: "+ platoC.disponible);
		
		platoC.nombre = "Tarta de queso";
		platoC.tipo = "Postre";
		platoC.precio = 6.00;
		platoC.disponible = false;

	}

}
