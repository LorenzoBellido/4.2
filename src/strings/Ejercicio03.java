package strings;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		// Variable donde guardar la frase introducida por parámetros
		String frase = "";
		
		// Variable donde guardar la cantidad de espacios de una frase
		int espacios = 0;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido una frase al usuario
		System.out.println("Introduzca una frase");
		frase = sc.nextLine();
		
		// Llamo a la función
		espacios = espacios(frase);
		
		// Muestro la cantidad de espacios
		System.out.println("Su frase tiene " + espacios + " espacios");
		
		// Cierro el Scanner
		sc.close();

	}
	
	// Función que devuelve los espacios de una frase introducida por parametros
	public static int espacios(String frase) {
		//Variable para guardar los espacios
		int numEspacios = 0;
		
		// Bucle que recorre el string y comprueba si tiene espacios
		for(int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i)==' ') {
				numEspacios++;
			}
		}
		
		return numEspacios;
	}

}
