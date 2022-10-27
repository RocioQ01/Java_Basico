package cl.generation.f20221026;

import java.util.Arrays;

public class Funciones1 {

	public static void main(String[] args) {
		//Funciones o metodo(llama)
		
		//Llamar a un metodo
		nombreMetodo();
		metodo2("Lulu");//Esta esperando un String
		metodo2("Tinguiritinguis");
		metodo3(3);
		metodo4(77,9.9f);
		String[] vocales = {"a","e","i","o","u"};//Creamos un arreglo
		metodo5(vocales);
		//metodos con llamados
		retorno11();//No hace nada con el valor retornado
		//System.out.println(retorno1());
		Integer valorRetornado = retorno11();
		System.out.println(valorRetornado);
		System.out.println(valorRetornado/7);//35/7=5
		System.out.println(valorRetornado/5);//35/5=7
		
		String NombreCompleto = getNombreCompleto("Rodriguez","Rocio","Quezada");
		System.out.println("El nombre completo es: "+NombreCompleto);
		//Swagger
		llamadaAOtroMetodo();

	}
	private static Integer retorno1; {
	}
	//Definicion o estructura de un metodo
	//void-> el metodo no retorna ningun valor
	//Si las funciones no son llamadas no hacen nada
	public static void nombreMetodo() {
		System.out.println("Estoy dentro del metodo inicial...");
	}
	
	public static void metodo2(String palabra) {
		System.out.println("Soy "+palabra);
	}
	public static void metodo3(Integer numero) {
		System.out.println("Soy el numero "+numero);
	}
	public static void metodo4(int numero1,Float numero2) {
		System.out.println("Soy el numero "+numero1);
		System.out.println("Soy el numero "+numero2);
	}
	public static void metodo5(String[] arreglito) {
		System.out.println("Soy el arreglo "+Arrays.toString(arreglito));
	}
	//Funciones con retorno
	
	public static Integer retorno11() {
		Integer totalAlumnos= 35;
		return totalAlumnos;
	}
	/**
	 * Metodo que une todos los datos
	 * @param apeMaterno
	 * @param nombre
	 * @param apePaterno
	 * @return NombreCompleto
	 */
	public static String getNombreCompleto(String apeMaterno,String nombre,String apePaterno) {
		//No importa el orden en el que se ingresen, funciona igual
		String NombreCompleto = nombre+" "+apePaterno+" "+apeMaterno;
		return NombreCompleto;//retornamos el contenido de la variable
	}
	//Metodo que llama a otro metodo
	
	public static void llamadaAOtroMetodo() {//Captura el metodo
		System.out.println("Llamada a otro metodo desde un metodo");
		metodo4(1234,54.3f);
	}
	
	
	
	
	
	
}
