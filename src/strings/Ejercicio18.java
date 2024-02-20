package strings;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {

		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);

		// Variable donde guardar una cadena
		String titulo = "";

		// Variable donde guardar una cadena
		String contenido = "";

		// Pido al usuario los valores
		System.out.println("Introduce los valores");
		titulo = sc.nextLine();
		contenido = sc.nextLine();

		// Muestro el resultado
		System.out.println(html(titulo, contenido));

	}

	/**
	 * Metodo para mostrar lo introducido por teclado en código html
	 * 
	 * @param titulo    String del titulo de la pagina
	 * @param contenido String del contenido de la pagina
	 * @return Devuelve el codigo html
	 */
	public static String html(String titulo, String contenido) {

		// String para guardar el codigo html
		String html = "";

		html = "<HTML><HEAD><TITLE>" + titulo + "</TITLE></HEAD><BODY><H1>" + titulo + "</H1><DIV><P>" + contenido
				+ "</P></DIV></BODY></HTML>";

		return html;

	}

}
