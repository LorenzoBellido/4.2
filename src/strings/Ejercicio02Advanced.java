package strings;

import java.util.Scanner;

public class Ejercicio02Advanced {

	public static void main(String[] args) {

		// Variable donde guardar la contraseña del primer jugador introducida por
		// teclado
		String contraseña = "";

		// Variable donde guardar la frase del segundo jugador introducida por teclado
		String frase = "";

		// Variable para mostrar los caracteres acertados
		String caracteresAcertados = "";

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Pido la contraseña por teclado
		System.out.println("Introduce una contraseña sin espacios:");
		contraseña = sc.next();

		sc.nextLine();

		// Pido la contraseña al segundo jugador
		System.out.println("Introduce la contraseña sin espacios:");
		frase = sc.next();

		// Compruebo si la cadena tiene la misma distancia y voy añadiendo los
		// caracteres que correspondan y los que no añado un asterisco
		if (contraseña.length() < frase.length()) {
			System.out.println("La contraseña es más pequeña");
		} else if (contraseña.length() > frase.length()) {
			System.out.println("La contraseña es más grande");
		} else {
			for (int i = 0; i < contraseña.length(); i++) {
				if (contraseña.charAt(i) == frase.charAt(i)) {
					caracteresAcertados += contraseña.charAt(i);
				} else {
					caracteresAcertados += "*";
				}
			}
		}

		// Imprimo los caracteres acertados
		System.out.println(caracteresAcertados);

	}

}
