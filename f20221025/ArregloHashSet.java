package cl.generation.f20221025;

import java.util.HashSet;

public class ArregloHashSet {

	public static void main(String[] args) {
		//Set o HashSet
		//Definicion
		//HashSet<Tipo de dato> nombre_arreglo = new HashSet<Tipo de dato>();
		HashSet<String> relatores = new HashSet<String>();
		//2)Agregar elemento al array
		relatores.add("Alejandro");
		relatores.add("Andrea");
		relatores.add("Laura");
		relatores.add("Pamela");
		relatores.add("Hector");
		relatores.add("Maggi");
		relatores.add("Israel");
		relatores.add("Alejandro");
		System.out.println(relatores);
		
		//3) Verificar el contenido del arreglo
		boolean verificacionNombre = relatores.contains("Pamela");
		System.out.println("existe el relator"+verificacionNombre);
		
		//4) Eliminar un elemento por el contenido
		relatores.remove(relatores);
	}
}
