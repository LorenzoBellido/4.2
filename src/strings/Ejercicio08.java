package strings;

public class Ejercicio08 {

	public static void main(String[] args) {

		// Variable donde guardar la frase palíndroma
		String palindroma = "Dabale arroz a la zorra el abad";

		// Llamo a la funcio para ver si es palindroma y muestro el resultado por
		// pantalla
		if (palindroma(palindroma)) {
			System.out.println("Su frase es palíndroma");
		} else {
			System.out.println("Su frase no es palíndroma");
		}

	}

	/**
	 * Función que comprueba si una frase es palindroma (se escribe igual de
	 * izquierda a derecha que de derecha a izquierda)
	 * 
	 * @param frase String introducido por parámetro
	 * @return Devuelve un booleano si la frase es palíndroma o no
	 */
	public static boolean palindroma(String frase) {
		// Booleano si la frase es palíndroma o no
		boolean palindroma = false;

		// Variable donde guardar la frase sin espacios
		String fraseNoEsp = "";

		// Variable donde guardar la frase alreves sin espacios
		String fraseAlr = "";

		// Bucle que recorre la cadena introducida por parámetros y la escribe alreves y
		// sin espacios
		for (int i = frase.length() - 1; i > -1; i--) {
			if (frase.charAt(i) != ' ') {
				fraseAlr += frase.charAt(i);
			}
		}
		// Bucle que recorre la cadena introducida por parámetros y la escribe sin
		// espacios
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) != ' ') {
				fraseNoEsp += frase.charAt(i);
			}
		}
		// Si ambas cadenas son iguales devolverá true
		if (fraseNoEsp.equalsIgnoreCase(fraseAlr)) {
			palindroma = true;
		}

		return palindroma;
	}
}
