package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {

		// Variable donde guardar la frase introducida
		String frase = "";

		// Array para guardar las palabras de la frase
		String[] palabras;

		// Scanner para leer del tecladoç
		Scanner sc = new Scanner(System.in);

		// Pido una frase al usuario
		System.out.println("Introduzca una frase");
		frase = sc.nextLine();

		// Separo la frase y la introduzco en un array
		palabras = frase.split(" ");

		// Ordeno el Array
		Arrays.sort(palabras);

		// Muestro el Array
		for (String palabra : palabras) {
			System.out.print(palabra + " ");
		}

		// Cierro el Scanner
		sc.close();

	}

}
