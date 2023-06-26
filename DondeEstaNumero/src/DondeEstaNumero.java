import java.util.Scanner;
import util.*;

/**
 * 5. Bucles
 * 
 * 26. Realiza un programa que pida primero un número y a continuación un
 * dígito. El programa nos debe dar la posición (o posiciones) contando de
 * izquierda a derecha que ocupa ese dígito en el número introducido.
 * 
 */

public class DondeEstaNumero {

	private static int cantidad(int numero) {
		int cantidad = 0;

		while (numero > 0) {
			cantidad++;
			numero /= 10;
		}

		return cantidad;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		int digito = -1;

		numero = Entrada.pedirEntero("Dime un número entero cualquiera: ");
		int longitud = cantidad(numero); // Para desglosarlo en el bucle

		do {
			digito = Entrada.pedirEntero("Ahora, dime un dígito (del 0 al 9): ");
		} while (digito < 0 || digito >= 10);

		// Para saber si contiene el dígito
		if (String.valueOf(numero).contains(String.valueOf(digito))) {
			System.out.println("El dígito está en la posición o posiciones:");
		} else {
			System.out.println("El dígito no está en ninguna posición.");
		}
		
		System.out.print("Estrictamente con bucles:");
		int numeroAux = numero;
		
		for (int i = 0; numeroAux > 0; i++) {

			if (numeroAux % 10 == digito) {
				System.out.print(" " + (longitud - i));
			}

			numeroAux /= 10;
		}

		System.out.print("\nPor funciones de cadenas. La mejor opción, sin funciones extra desarrolladas y sin arrays:");
		String numeroString = String.valueOf(numero);
		int indice = 0;

		while (indice != -1) {
			if (indice == 0) {
				indice = numeroString.indexOf(String.valueOf(digito));
			} else {
				indice = numeroString.indexOf(String.valueOf(digito), indice + 1);
			}
			
			if (indice != -1) {
				System.out.print(" " + (indice + 1));
			}
		}
		
		System.out.print("\nCon arrays (buena opción, y poco código):");
		char[] tablaNumeros = String.valueOf(numero).toCharArray(); 
		
		for(int i = 0; tablaNumeros.length > i; i++) {
			if (Character.getNumericValue(tablaNumeros[i]) == digito) { //Para comparar entre ints y no char con int
				System.out.print(" " + (i + 1));
			}
		}
		
	}

}