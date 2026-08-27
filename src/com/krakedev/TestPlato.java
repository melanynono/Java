package com.krakedev;

public class TestPlato {

	public static void main(String[] args) {
		
		Plato platoA = new Plato("Coctel de camarones", "Entrada", 6.5, true);
		
		System.out.println("=======Plato A========");
		
		System.out.println("Nombre: "+ platoA.getNombre());
		System.out.println("Tipo: "+ platoA.getTipo());
		System.out.println("Precio: "+ platoA.getPrecio());
		System.out.println("Disponible: "+ platoA.isDisponible());
		
		Plato platoB = new Plato("Arroz marinero", "Plato fuerte", 15.0, true);
		
		System.out.println("=======Plato B========");
		
		System.out.println("Nombre: "+ platoB.getNombre());
		System.out.println("Tipo: "+ platoB.getTipo());
		System.out.println("Precio: "+ platoB.getPrecio());
		System.out.println("Disponible: "+ platoB.isDisponible());
		
		Plato platoC = new Plato("Tarta de queso", "Postre", 6.0, true);
		
		System.out.println("=======Plato C========");

		System.out.println("Nombre: "+ platoC.getNombre());
		System.out.println("Tipo: "+ platoC.getTipo());
		System.out.println("Precio: "+ platoC.getPrecio());
		System.out.println("Disponible: "+ platoC.isDisponible());

	}

}
