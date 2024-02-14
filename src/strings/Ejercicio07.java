package strings;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {

		// Variable donde guardar una frase
		String frase = "Tengo una pelota de color rosa como una rosa";

		// Variable donde guardar una frase introducida
		String palabra = "";

		// Variable donde guardar la cantidad de palabras iguales en la frase
		int numPalabras = 0;

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Pido al usuario una palabra
		System.out.println("Introduzca una palabra");
		palabra = sc.next();

		// Llamo a la funcion que me cuenta el número de palabras iguales a la
		// introducida en la frase
		numPalabras = cuentaPalabras(frase, palabra);

		// muestro la cantidad por pantalla
		System.out.println(numPalabras);

		// Cierro el Scanner
		sc.close();

	}

	/**
	 * Función que cuenta la cantidad de palabras iguales a la introducida en la
	 * frase
	 * 
	 * @param frase   Cadena String introducida por parametros
	 * @param palabra Cadena String introducida por el usuario
	 * @return Cantidad de palabras iguales a la introducida
	 */
	public static int cuentaPalabras(String frase, String palabra) {
		// Variable donde guardar la cantidad de palabras iguales
		int palabras = 0;
		// Variable para buscar en la frase la palabra
		int inicio = 0;

		// Bucle que comprueba que el inicio sea menor que la longitud del String
		while (inicio < frase.length()) {
			// Condicional que si encuentra la palabra introducida por parámetros en la
			// frase recibe una posición que será mayor o igual que 0 y sumara uno a
			// palabras encontradas y otro a inicio para que pase a la sigiente posición
			if (frase.indexOf(palabra, inicio) >= 0) {
				inicio = frase.indexOf(palabra, inicio);
				inicio++;
				palabras++;
				// Si no encuentra la palabra se sale del bucle incumpliendo la condicion del
				// while
			} else {
				inicio = frase.length() + 1;
			}
		}

		// Devuelvo la cantidad de palabras
		return palabras;
	}
}
