package util;

import java.math.BigDecimal;
import java.util.Scanner;

public class funciones {

	public static Scanner sc = new Scanner(System.in);

	// Solo lo hice porque puede servir para otras ocasiones
	public static BigDecimal pedirDecimal(String cadena) {
		BigDecimal decimal = null;

		while (decimal == null) {
			System.out.print(cadena);
			try {
				decimal = sc.nextBigDecimal();

				if (decimal.compareTo(BigDecimal.ZERO) < 0) {
					System.out.println("Por favor, introduzca un número que no sea negativo...");
					decimal = null;
				}
			} catch (Exception ex) {
				System.out.println("Por favor, introduzca un número con decimales delimitados por coma (,)...");
				sc.nextLine();
				decimal = null;
			}

		}

		return decimal;
	}
	
	public static double pedirDouble(String cadena) {
		double numero = -1;

		while (numero < 0) {
			System.out.print(cadena);
			try {
				numero = sc.nextDouble();

				if (numero < 0) {
					System.out.println("Por favor, introduzca un número que no sea negativo...");
				}
			} catch (Exception ex) {
				System.out.println("Por favor, introduzca un número...");
				sc.nextLine();
				numero = -1;
			}

		}

		return numero;
	}

	public static int iva() {
		String respuesta = "";
		int iva;

		do {
			System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
			respuesta = sc.next();
		} while (!(respuesta.equalsIgnoreCase("general") || respuesta.equalsIgnoreCase("reducido")
				|| respuesta.equalsIgnoreCase("superreducido")));

		switch (respuesta) {
			case "general" -> {
				iva = 21;
			}
			case "reducido" -> {
				iva = 10;
			}
			case "superreducido" -> {
				iva = 5;
			}
			default -> {
				iva = 0;
			}
		}
		
		return iva;
	}
	
	public static String codigoPromocional() {
		String respuesta = "";

		do {
			System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
			respuesta = sc.next();
		} while (!(respuesta.equalsIgnoreCase("nopro") || respuesta.equalsIgnoreCase("mitad")
				|| respuesta.equalsIgnoreCase("meno5") || respuesta.equalsIgnoreCase("5porc")));

		return respuesta;
	}
	
	public static BigDecimal codigoPromocionalNumero(double precio, String codigoPromocional) {
		BigDecimal decimal;
		
		switch (codigoPromocional) {
			case "mitad" -> {
				decimal =  new BigDecimal(precio / 2);
			}
			case "meno5" -> {
				decimal =  new BigDecimal(precio - 5);
			}
			case "5porc" -> {
				decimal =  new BigDecimal(precio * 5 / 100);
			}
			default -> {
				decimal =  BigDecimal.ZERO;
			}
		}
		
		return decimal;
	}
	
}