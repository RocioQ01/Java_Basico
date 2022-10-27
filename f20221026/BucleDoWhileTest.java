package cl.generation.f20221026;

import java.net.Socket;
import java.util.Scanner;

public class BucleDoWhileTest {

	public static void main(String[] args) {
		// doWhile
		// A lo menos se va a ejecutar una vez
		Scanner sc = new Scanner(System.in);
		int edad = 0;
		float kilos = 0;
		float estatura = 0;
		
		do {
			System.out.println("Ingresa tu edad");/*Si una variable queda dentro de {} nace y muere ahi*/
			edad = sc.nextInt();
		} while (edad < 18 || edad >120); //Si no se cumple con la condicion de la varible en este caso la edad 18, seguira pidiendo hasta que la condicion se cumpla
		
		System.out.println("Edad ingresada "+edad);
		
		//Peso
		do {
			System.out.println("Ingresa tus kilos");
			kilos = sc.nextFloat();
			
		} while (kilos < 40 || kilos >150);
		System.out.println("Kilos ingresados es "+kilos);
		
		//Estatura
		do {
			System.out.println("Ingresa tu estatura");
			estatura = sc.nextFloat();
			
		} while (estatura< 1.30 || estatura> 2.00);
		System.out.println("Estatura ingresada es de "+estatura);

		sc.close();
//nombre -apellido
//Mensaje
//Arreglar el bucle
//14:30
	}

}
