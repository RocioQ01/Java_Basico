package cl.generation.f20221027;

import java.util.Scanner;

public class CalculoTest {

	public static void main(String[] args) {

		/*Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese la base: ");
		float b = scanner.nextFloat();
		
		System.out.println("Ingrese la altura: ");
		float h = scanner.nextFloat();
		
		float perimetro = b * 2 + h * 2;
		System.out.println("El perimetro es: "+perimetro);
		
		float area = b * h;
		System.out.println("El area es: "+area);*/

	}

	public static void menu() {
		System.out.println("**************************");
		System.out.println("*          Menú          *");
		System.out.println("**************************");
		System.out.println("Escoja operación deseada:");
		System.out.println("1. Calcular área y perímetro de TRIANGULO");
		System.out.println("2. Calcular área y perímetro de RECTANGULO");
		System.out.println("3. Calcular área y perímetro de CIRCUNFERENCIA ");
		System.out.println("0. SALIR ");
		System.out.println("**************************");
    
    
       Scanner scanner = new Scanner(System.in);
       int opcion = 0;
    
    do {
			System.out.println("*Selecciona una opción*");
			opcion = scanner.nextInt();

		} while (opcion < 0 || opcion > 3);
		
		switch (opcion) {
		case 1:
			//System.out.println("triangulo");
			break;
		case 2:
			//System.out.println("rectangulo");
			break;
		case 3:
			//System.out.println("circulo");
			break;
		case 0:
			//System.out.println("salir");
			break;

		default:
			//System.out.println("Opcion no valida");
			break;
		}
	}
}
