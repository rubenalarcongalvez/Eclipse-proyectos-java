import java.util.Scanner;

/*
 * 21. Realiza un programa que vaya pidiendo números hasta que se introduzca un número negativo y
 *   nos diga cuántos números se han introducido, la media de los impares y el mayor de los pares. 

	El número negativo sólo se utiliza para indicar el final de la introducción de datos pero no se incluye en el cómputo.

 */

public class MediaImpares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		int contador = 0;
		double totalImpares = 0;
		int contadorImpares = 0;
		int mayorPares = 0;

		while (numero >= 0) {
			System.out.print("Dime un número natural (dame un número negativo para parar): ");

			//Controlamos la entrada (no hace falta funciones porque solo lo usaré en una parte del código)
			try {
				numero = sc.nextInt();
				
				if (numero >= 0) {
					contador++;
					
					//Vemos si es par o impar, y pongamos el mayor
					if (numero % 2 == 0 && numero > mayorPares) {
						mayorPares = numero;
					} else if (numero % 2 != 0) {
						totalImpares += numero;
						contadorImpares++;
					}
				}
			} catch (Exception ex) {
				System.out.println("Dime un número ENTERO (sin decimales)...");
				sc.nextLine();
			}
			
		}
		
		sc.close();
		
		System.out.println("\n=== RESULTADOS ===");
		System.out.println("Se han introducido " + contador + " números.");
		
		//Si no hay impares, no lo muestro
		if (contadorImpares != 0) {
			System.out.printf("La media de los números impares es de %.2f", (totalImpares / contadorImpares)); //Truncado a las centésimas
		}
		
		//Si no hay pares, no lo muestro
		if (contador - contadorImpares != 0) System.out.println(".\nEl mayor número par es " + mayorPares + ".");
	}

}
