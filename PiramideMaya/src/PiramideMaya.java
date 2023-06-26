import java.util.Scanner;

/*
 * Ejercicio 69 -  Realiza un programa que pinte una pirámide maya. Por los lados, se trata de una pirámide normal y corriente. 
 * Por el centro se van pintando líneas de asteriscos de forma alterna (empezando por la superior): la primera se pinta, la segunda no,
 *  la tercera sí, la cuarta no, etc. La terraza de la pirámide siempre tiene 6 asteriscos, por tanto, las líneas centrales que se añaden a la 
 *  pirámide normal tienen 4 asteriscos. El programa pedirá la altura. Se supone que el usuario introducirá un número entero mayor o igual a 3;
 *   no es necesario comprobar los datos de entrada.
 *   
 */

public class PiramideMaya {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	    System.out.print("Introduzca la altura de la pirámide: ");
	    int alturaIntroducida = Integer.parseInt(sc.nextLine());

	    int planta = 1;
	    int longitudDeLinea = 1;
	    int espacios = alturaIntroducida - 1;

	    while (planta <= alturaIntroducida) {

	      //Izquierda
	      for (int i = 1; i <= espacios; i++) {
	        System.out.print(' ');
	      }
	      for (int i = 0; i <= longitudDeLinea / 2; i++) {
	        System.out.print('*');
	      }

	      //Centro
	      System.out.print(planta % 2 == 1 ? "****" : "    ");

	      //Derecha
	      for (int i = 0; i <= longitudDeLinea / 2; i++) {
	        System.out.print('*');
	      }
	      System.out.println();

	      planta++;
	      espacios--;
	      longitudDeLinea += 2;
	    }
	}

}