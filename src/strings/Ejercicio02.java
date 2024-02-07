package strings;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		// Variable donde guardar la contraseña del primer jugador introducida por
		// teclado
		String contraseña = "";

		// Variable donde guardar la frase del segundo jugador introducida por teclado
		String frase = "";

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Pido la contraseña por teclado
		System.out.println("Introduce una contraseña sin espacios:");
		contraseña = sc.next();

		sc.nextLine();

		System.out.println("Introduce la contraseña sin espacios:");
		frase = sc.next();

		// Muestro la distancia alfabeticamente
		System.out.println(contraseña.compareTo(frase));

	}

}
