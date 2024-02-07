package strings;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		// Variable para guardar una frase introducida por el usuario
		String frase;

		// Scanner para leer por teclado
		Scanner sc = new Scanner(System.in);

		// Pido una frase al usuario
		System.out.println("Introduce una frase");
		frase = sc.next();

		// Muestro la cantidad de caracteres
		System.out.println(frase.length());

		// cierro el Scanner
		sc.close();
	}

}
