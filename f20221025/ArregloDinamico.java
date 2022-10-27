package cl.generation.f20221025;

import java.util.ArrayList;

public class ArregloDinamico {
	
	public static void main(String[] args) {
		//ArrayLisrt
		//1) Definicion
		//ArrayList<TIPODATO> nombre_array = new ArrayList<TIPODATO>();
		ArrayList<String> GargolasTeam = new ArrayList<String>();
		//2) Agregar valores al arreglo
		GargolasTeam.add("Rocio");
		GargolasTeam.add("Francisca");
		GargolasTeam.add("Luis");
		GargolasTeam.add("Julian");
		GargolasTeam.add("Javier");
		System.out.println(GargolasTeam);
		//3) Tamaño del arraylist
		System.out.println(GargolasTeam.size());
		/*Si es size es dinamico - Si es length es estatico(arrays)*/
		//4) Obtener un elemento dentro del arreglo(para obtenerlo se usa el "get")
		System.out.println(GargolasTeam.get(3));
		System.out.println(GargolasTeam.get(2));
		//5) Eliminar un elemento dentro del array, por posicion
		GargolasTeam.remove(4);
		GargolasTeam.remove(0);
		GargolasTeam.add("Javier");
		System.out.println(GargolasTeam);
		//6) Recorrer el ArrayList
		for(int i = 0; i<GargolasTeam.size();i++){
			System.out.println("Gargolas: "+GargolasTeam.get(i));
		}
		System.out.println("^^^^^^^^^^^^^^");
		//for interador o for de objeto
		for(String Gargola: GargolasTeam ) {
			System.out.println(Gargola);
			
		}
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		
		for(Integer numero :numeros) {
			System.out.println(numero);
		}

		
	}
}
