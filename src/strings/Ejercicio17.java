package strings;

public class Ejercicio17 {
	public static final String FIN = "*/";
	public static final String INICIO = "/*";

	/**
	 * Metodo para eliminar las etiquetas de comentario
	 * @param codigoC Cadena introducida por teclado
	 * @return Devuelve la cadena sin comentarios
	 */
	public static String sinComentarios(String codigoC) {
		// Cadena sin comentarios
		String cadSinComentarios = "";
		// variale donde guadar el inicio de la frase
		int inicio = codigoC.indexOf(INICIO);
		// variale donde guadar el fin de la frase
		int fin = 0;

		//Bucle para recorrer la cadena y eliminar las etiquetas de comentario
		while (inicio != -1) {
			cadSinComentarios += codigoC.substring(fin, inicio);
			fin = codigoC.indexOf(FIN, inicio) + FIN.length();
			inicio = codigoC.indexOf(INICIO, fin);
		}

		return cadSinComentarios;
	}

	
	
	public static void main(String[] args) {
		// Frase para eliminar los comentarios
		String codigoC = "/* comentario inicial*/ if (a==3) /* igual a tres */ a++; /* incrementamos a */";
		// Muestro el resultado
		System.out.println(sinComentarios(codigoC));
	}
}