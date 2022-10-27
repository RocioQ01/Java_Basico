package cl.generation.f20221026;

import java.util.Scanner;

public class CapturarDatos {

	public static void main(String[] args) {
		Float IMC = calculoIMC();
		// nivelIMC(IMC);
	}

	public static Float calculoIMC() {
		// Capturar datos ingresados por el usuario
		Scanner sc = new Scanner(System.in);// Es de ingreso
		// calculo del IMC;
		// imc= kilos/(estatura*estatura);
		System.out.println("Ingresa su peso en kilogramos");
		Float peso = sc.nextFloat();
		System.out.println("El peso del paciente es: " + peso);

		System.out.println("Ingresa su estatura en metros");
		Float estatura = sc.nextFloat();
		System.out.println("La estatura del paciente es: " + estatura);

		Float IMC = peso / (estatura * estatura);
		System.out.println("Su IMC es: " + IMC);
		nivelIMC(IMC);
		sc.close();

		return IMC;
	}

	public static void nivelIMC(Float IMC) {
		/*
		 * Por debajo de 18.5 Bajo peso 18.5 - 24.9 Normal 25.0 - 29.9 Sobrepeso 30.0
		 * más Obeso
		 */

		if (IMC < 18.5F) {
			System.out.println("El paciente esta en el rango BAJO PESO");
		} else if (IMC >= 18.5F && IMC < 25) {
			System.out.println("El paciente esta en el rango NORMAL");
		} else if (IMC >= 25 && IMC < 30) {
			System.out.println("El paciente esta en el rango SOBRE PESO");
		} else if (IMC >= 30) {
			System.out.println("El paciente esta en el rango OBESO");

		}

	}

}
