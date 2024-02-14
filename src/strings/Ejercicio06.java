package strings;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		// Variable donde guardar las palabras
		String palabra = "";

		// String para guardar la frase completa
		String frase = "";

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Bucle que seguirá preguntando hasta que la palabra sea "fin"
		while (!palabra.equalsIgnoreCase("fin")) {
			frase += palabra + " ";
			System.out.println("Introduzca una palabra. Si desea finalizar introduzca \"fin\"");
			palabra = sc.next();
		}

		// Muestro la frase completa
		System.out.println(frase);

	}

}
