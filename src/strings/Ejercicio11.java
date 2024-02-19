package strings;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {

		// Array de char para guardar las letras codificadas
		char conjunto1[] = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };

		char conjunto2[] = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };

		// Variable donde guardar la frase para codificar
		String frase;

		// Caracter codificado
		char codificado;
		
		// Variable donde guardar el mensaje codificado
		String mensajeCod = "";

		// Scanner para leer la frase
		Scanner sc = new Scanner(System.in);
		
		// Pido un texto
		System.out.println("Introduzca un mensaje para codificar");
		frase = sc.nextLine();
		
		// Cambio la frase a minusculas
		frase = frase.toLowerCase();
	
		for(int i = 0; i < frase.length(); i++) {
			codificado = frase.charAt(i);
			codificado = codifica(conjunto1, conjunto2, codificado);
			mensajeCod += codificado;
		}
		
		System.out.println(mensajeCod);
	}
	
	public static char codifica(char conjunto1[], char conjunto2[], char c) {
		char codificado = 0;

		for(int i = 0; i < conjunto1.length; i++) {
			if(conjunto2[i] == c) {
				codificado = conjunto1[i];
			}
			if(codificado == 0) {
				codificado = c;
			}
		}
		
		return codificado;
	}

}
