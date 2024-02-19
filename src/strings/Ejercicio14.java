package strings;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {

		// Variable donde guardar una palabra
		String palabra = "";

		// Variable donde guardar la cantidad de letras
		int cantidad = 0;

		// ariable auxiliar del indice
		int index = 0;

		// Variable contador
		int contador = 0;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Pido una palabra al usuario
		System.out.println("Introduzca una palabra");
		palabra = sc.next();

		for (int i = 0; i < palabra.length(); i++) {

			while (index < palabra.length()) {
				if (palabra.charAt(i) == palabra.charAt(index)) {
					contador++;
				}
				index++;
				
			}
			System.out.println(palabra.charAt(i) + " Hay " + contador);
			contador = 0;
			index = 0;
		}

	}
}
