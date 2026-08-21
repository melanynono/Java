package com.krakedev;

public class TestPlato {

	public static void main(String[] args) {
		
		Plato platoA = new Plato();
		
		System.out.println("=======Plato A========");
		System.out.println("Nombre: "+ platoA.getNombre());
		System.out.println("Tipo: "+ platoA.getTipo());
		System.out.println("Precio: "+ platoA.getPrecio());
		System.out.println("Disponible: "+ platoA.isDisponible());
		
		platoA.setNombre("Coctel de camarones");
		platoA.setTipo("Entrada");
		platoA.setPrecio(6.5);
		platoA.setDisponible(true);
		
		System.out.println("Nombre: "+ platoA.getNombre());
		System.out.println("Tipo: "+ platoA.getTipo());
		System.out.println("Precio: "+ platoA.getPrecio());
		System.out.println("Disponible: "+ platoA.isDisponible());
		
		Plato platoB = new Plato();
		
		System.out.println("=======Plato B========");
		System.out.println("Nombre: "+ platoB.getNombre());
		System.out.println("Tipo: "+ platoB.getTipo());
		System.out.println("Precio: "+ platoB.getPrecio());
		System.out.println("Disponible: "+ platoB.isDisponible());
		
		platoB.setNombre("Arroz marinero");
		platoB.setTipo("Plato fuerte");
		platoB.setPrecio(15.0);
		platoB.setDisponible(true);
		
		System.out.println("Nombre: "+ platoB.getNombre());
		System.out.println("Tipo: "+ platoB.getTipo());
		System.out.println("Precio: "+ platoB.getPrecio());
		System.out.println("Disponible: "+ platoB.isDisponible());
		
		Plato platoC = new Plato();
		
		System.out.println("=======Plato C========");
		System.out.println("Nombre: "+ platoC.getNombre());
		System.out.println("Tipo: "+ platoC.getTipo());
		System.out.println("Precio: "+ platoC.getPrecio());
		System.out.println("Disponible: "+ platoC.isDisponible());
		
	
		platoC.setNombre("Postre");
		platoC.setTipo("Plato fuerte");
		platoC.setPrecio(6.0);
		platoC.setDisponible(false);
		
		System.out.println("Nombre: "+ platoC.getNombre());
		System.out.println("Tipo: "+ platoC.getTipo());
		System.out.println("Precio: "+ platoC.getPrecio());
		System.out.println("Disponible: "+ platoC.isDisponible());

	}

}
