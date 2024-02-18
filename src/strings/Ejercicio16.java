package strings;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {

		// Variable donde guardar la palabra intoducida por teclado
		String palabra = "";

		// Array para desordenar la cadena
		char[] palabraArray;

		// Variable donde guardar la palabra del siguiente jugador
		String intento = "";

		// Array para guardar el intento
		char[] intentoArray;

		// Scaner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Pido al usuario una palabra
		System.out.println("Introduce una palabra");
		palabra = sc.next();

		// Compruebo que la palabra no está vacía
		while (palabra.isEmpty()) {
			sc.nextLine();
			System.out.println("La cadena está vacía. Introduzca una palabra");
			palabra = sc.next();
		}
		// Guardo la palabra en un array de caracteres
		palabraArray = palabra.toCharArray();

		// Llamo a la función para desordenar la palabra
		anagrama(palabraArray);

		// Muestro la palabra desordenada
		System.out.print("El anagrama es: ");
		for (char valor : palabraArray) {
			System.out.print(valor);
		}
		System.out.println();

		// Pido al jugador 2 el intento
		System.out.println("Introduzca la palabra");
		intento = sc.next();

		// Compruebo que las palabras sean de la misma longitud
		while (intento.length() != palabra.length()) {
			sc.nextLine();
			System.out.println("La palabra introducida no tiene la misma longitud");
			intento = sc.next();
		}

		// Convierto la palabra sin desordenar y el intento en un array de caracteres
		palabraArray = palabra.toCharArray();
		intentoArray = intento.toCharArray();

		System.out.println(aciertos(palabraArray, intentoArray));

		// Cierro el Scanner
		sc.close();

	}

	/**
	 * Funcion que desordena el array recibido por parametros
	 * 
	 * @param palabraArray Array de caracteres recibido por parametros el cual se le
	 *                     modifican las posiciones de los caracteres
	 */
	public static void anagrama(char[] palabraArray) {
		// Variable indice
		int index;
		Random random = new Random();
		// Bucle que recorre el array
		for (int i = palabraArray.length - 1; i > 0; i--) {
			index = random.nextInt(i + 1);
			if (index != i) {
				// Intercambio los caracteres
				char caracter = palabraArray[index];
				palabraArray[index] = palabraArray[i];
				palabraArray[i] = caracter;
			}
		}
	}

	/**
	 * Metodo que devuelve un String con los caracteres que coinciden de ambas
	 * cadenas
	 * 
	 * @param palabraArray Array introducido por parametro de la palabra
	 * @param intentoArray Array introducido por parametro del intento
	 * @return devuelve un String con los caracteres acertados
	 */
	public static String aciertos(char[] palabraArray, char[] intentoArray) {
		// Variable donde guardar los caracteres que coinciden
		String aciertos = "";

		// Bucle que recorre las posiciones de ambas cadenas y comprueba si los
		// caracteres son iguales
		for (int i = 0; i < palabraArray.length; i++) {
			if (palabraArray[i] == intentoArray[i]) {
				aciertos += palabraArray[i];
			} else {
				aciertos += "*";
			}
		}

		return aciertos;

	}

}
