package cl.generation.f20221024;

public class Main {

	public static void main(String[] args) {
		//Las variables
		//var nombre_variable (JavaScript)
		
		/*Variables primitivas, caracter estatico, solo tiene una opcion*/ /*Se escriben con miniscula*/
		int numero1 = 2; //Variable numerica -2^31 y +2^31-1
		//-2,147,483,648 y el maximo 2,147,483,647 (inclusive).
		//En java es obligatorio terminar con ";"
		//Se agrega una "f" de float.
		float decimal= 2.5f;
		float decimal2= (float) 2.5; //Castear (Transforma al numero)
		//3.4028235x1038 (Tamaño de float)
		
		
		long numero2 = 32l; //Se agrega una "l" de long. //-2^63 y 2^63-1
		double decimal3= 9.8d; //64 bits
		
		char caracter = '4';//No considera las comillas dobles, 'SOLO SE DEBE USAR COMILLAS SIMPLES'
		//Se usa solo un caracter a la vez.
		
		boolean respuesta= true; //False
		//Nos ayudan a determinar si es verdadero o falso
		/*Hasta aqui llegan las variables primitivas*/
		
		//short y byte
	    System.out.println(numero1+" "+numero2+" "+decimal+" "+decimal2);
		System.out.println(decimal3+" "+caracter+" "+respuesta );
		
		//Se define de inmediato la variable
		String palabra= "gjhkfj"; //Cadena de caracteres, empieza con mayuscula.
		//palabra
		
		
		//Variable objeto
		Integer numero3 = 2; //variable numerica -2^31 y +2^31-1
		//numero2.
		Long numero4 = 1234567890L;
		Float numero5 = 987654321F;
		Double numero6 = 456D;
		
		

	}

}
