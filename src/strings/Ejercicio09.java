package strings;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Pido una frase al usuario
		System.out.println("Introduce una frase:");
		String frase = sc.nextLine();

		// compruebo llamando a la funcion si la frase esta en idioma de Javalandia
		if (esJavalandia(frase)) {
			// Traduzco la frase eliminando las muletillas con una funcion
			String mensajeSinMuletillas = sinMuletillas(frase);
			// Muestro la frase sin muletillas
			System.out.println("Mensaje traducido sin muletillas:");
			System.out.println(mensajeSinMuletillas);
		} else {
			System.out.println("La frase no está escrita en el idioma de Javalandia.");
		}
	}

	// Verifica si la frase está escrita en el idioma de Javalandia
	public static boolean esJavalandia(String frase) {
		boolean esJavalandia = false;

		if (frase.startsWith("Javalín, javalón") || frase.endsWith("javalén, len, len")) {
			esJavalandia = true;
		}

		return esJavalandia;
	}

	// Obtiene el mensaje sin muletillas
	public static String sinMuletillas(String frase) {
		if (frase.startsWith("Javalín, javalón")) {
			int inicioMensaje = "Javalín, javalón".length();
			return frase.substring(inicioMensaje).trim();
		} else if (frase.endsWith("javalén, len, len")) {
			int finMensaje = frase.length() - "javalén, len, len".length();
			return frase.substring(0, finMensaje).trim();
		}
		// Si no hay muletillas, devuelve la frase original
		return frase;
	}
}
