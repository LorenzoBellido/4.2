package strings;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		// Variable donde guardar la frase introducida
		String frase = "";

		// Variable donde guardar la frase alreves
		String fraseAlr = "";

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Pido una frase al usuario
		System.out.println("Introduzca una frase");
		frase = sc.nextLine();

		// Llamo a la función
		fraseAlr = alreves(frase);

		// Imprimo la frase alreves
		System.out.println(fraseAlr);

	}

	// Función que da la vuelta a una frase introducida por parámetros
	public static String alreves(String frase) {
		// Variable para devolver la cadena alreves
		String fraseAlr = "";

		// Recorro la frase de forma inversa y vot concatenando los caracteres
		for (int i = frase.length() - 1; i > -1; i--) {
			fraseAlr += frase.charAt(i);
		}

		return fraseAlr;
	}

}
