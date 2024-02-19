package strings;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		// Variable donde guardar una cadena introducida por teclado
		String frase = "";
		
		// Array donde guardar la palabra
		String [] palabra;
		
		// VAriable donde guardar el maximo
		int max = 0;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido una frase al usuario
		System.out.println("Introduce una frase");
		frase = sc.nextLine();
		
		// Divido la frase en palabras y lo meto en un Array
		palabra = frase.split(" ");
		
		for(int i = 0; i < palabra.length; i++) {
			if(palabra[i].length()>max) {
				frase = palabra[i];
			}
		}
		
		
		System.out.println(frase);
		sc.close();
	}

}
