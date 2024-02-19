package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		
		// Variable donde guardar anagramas
		String frase = "";
		
		String frase2 = "";
		
		// Booleano para saber si son anagramas
		boolean anagrama;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce dos palabras");
		frase = sc.next();
		frase2 = sc.next();
		
		anagrama = anagrama(frase, frase2);
		
		if (anagrama) {
			System.out.println("Las palabras son anagramas");
		}else {
			System.out.println("Las palabras no son anagramas");
		}

	}

	public static boolean anagrama(String palabra, String palabra2) {
		boolean anagrama = false;

		char [] frase;
		
		char [] frase2;
		
		frase = palabra.toCharArray();
		
		frase2 = palabra2.toCharArray();
		
		Arrays.sort(frase);
		Arrays.sort(frase2);
		
		if(Arrays.equals(frase, frase2)) {
			anagrama = true;
		}
		
		return anagrama;
	}
}
