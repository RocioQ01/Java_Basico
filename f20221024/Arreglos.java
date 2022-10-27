package cl.generation.f20221024;

import java.util.Arrays;

public class Arreglos

	public static void main(String[] args) {
	 /*Arreglos(Array) en Java (Estaticos, no cambia de tamaño)*/
		int[] arreglo = new int [3];
		//agregar datos - el dato debe ser numerico
		arreglo[0]=4;
		arreglo[1]=17;
		arreglo[2]=20;
		arreglo[3]=5; //error fuera de indice.
		/*Esta sobre pasando el limite de indice indicado
		"[0]" (indice)*/
		System.out.println(arreglo.toString());
		System.out.println(Arrays.toString(arreglo));
		System.out.println(arreglo[0]);
		
		//{}
		int[] sinNumeros = {};
		System.out.println(sinNumeros.length);
		sinNumeros[0] = 78; /*Para un arreglo vacio, NO SE PUEDE
		El valor de la variable
		es cero Para asignar valores por defecto se debe usar llaves "{}"*/
		String[] vocales = {"a","e","i","o","u"};
		System.out.println("cantidad de elementos "+vocales.length);
		vocales[1]= "o";
		vocales[3]= "e";
		vocales[2]= "y";
		vocales[0]= 1+"";
		
		/*Crear una array de numeros flotantes de tamaño 6*/
		float[] numeros= new float[6]; /*{1,2,3,4,5,6}*/
		//Agregar 6 elementos al arreglo
		numeros[0]= 33; 33.0; //el entero trae el ".0" por defecto
		numeros[1]= -0.6f;
		
		int[] numeroInt= new int[2];
		numeroInt[0]=(int) 0.2; //0.0
		System.out.println(numeroInt[0]);
		
		/*
		 * Crear un arreglo de enteros tamaño 100
		 * Y agregar valores dinamicamente,
		 * desde el 1 al 100
		 */
		
		int[] arreglo4 = new int[100];/*Le asigna el tamaño del array*/
		for (int i = 0; i < arreglo4.length; i = i + 1) {
			arreglo4[i] = i+1;
		}
		
		System.out.println(Arrays.toString(arreglo4));
		
		int[] arreglo100a1 = new int[100];
		//{100,99,98,97...0}
		for (int i=arreglo100a1.length; i>0 ;i-- ){
			arreglo100a1[arreglo100a1.length - i]= i;
		}
		System.out.println(Arrays.toString(arreglo100a1));
		
		int[] numeroInt = {-3,-5, 4,12, 3,35, -35,77,-1, 0};
		int numeroMax = 0;
		int numeroMin = 0;

		//
		for (int i = 0; i < numeroInt.length; i++){
		if(numeroInt[i] > numeroMax){ //12 > 4
		numeroMax = numeroInt[i]; //numeroMax = 4
		    //}
		if(numeroInt[i] < numeroMin) {
			numeroMin = numeroInt[i];
		}
		  }
		System.out.println(numeroMax);
		System.out.println(numeroMin);

	   


