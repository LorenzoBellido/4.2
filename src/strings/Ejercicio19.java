package strings;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Variable donde guardar una frase
		String frase = "";

		// Variable donde guardar la frase con notacion camel
		String fraseCamel = "";

		// Pido al usuario una frase
		System.out.println("Introduzca una frase");
		frase = sc.nextLine();

		// Quito los espacios de delante y detras.
		frase = frase.trim();

		// Llamo a la funcion para pasar a nomenglatura camel
		fraseCamel = camel(frase);

		// Muestro el resultado
		System.out.println(fraseCamel);

	}

	/**
	 * Metodo para cambiar la letra siguiente al espacio a mayuscula y borrar los
	 * espacios
	 * 
	 * @param frase Cadena introducida por teclado
	 * @return Devuelve la cadena en nomenglatura camel
	 */
	public static String camel(String frase) {
		// Variable donde guarar la frase ya cambiada
		String camel = "";

		// Variable para cambiar los caracteres de la frase
		char letra;

		// Bucle que recorre la cadena y pone en mayuscula la letra despues del espacio
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == ' ') {
				letra = frase.toUpperCase().charAt(i + 1);
				camel += letra;
				i++;
			} else {
				letra = frase.toLowerCase().charAt(i);
				camel += letra;
			}
		}

		return camel;
	}

}
