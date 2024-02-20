package strings;

public class Ejercicio20 {

	public static void main(String[] args) {
		String palabra = "destornillador";
		int n = 4;
		String[] secuencias = dividirEnSecuencias(palabra, n);
		for (String secuencia : secuencias) {
			System.out.println(secuencia);
		}
	}

	public static String[] dividirEnSecuencias(String palabra, int n) {
		int longitud = palabra.length();
		// tamaño de la secuencia dependiendo del tamaño de la palabra y depende de
		// cuanto en cuanto queremos agruparlas
		int cantidadSecuencias = longitud / n;
		// String de la logintud del tamaño de la palabra entre el numero de letras que
		// quiero agruparlas (n)
		String[] secuencias = new String[cantidadSecuencias + 1];
		// Indice para recorrer el string de las secuencias
		int indiceSecuencia = 0;
		// For para recoger las letras dentro del string
		for (int i = 0; i < longitud; i += n) {

			secuencias[indiceSecuencia] = palabra.substring(i, Math.min(i + n, longitud));
			indiceSecuencia++;
		}
		// return para mandar las secuencias en un array de tipo string
		return secuencias;
	}
}