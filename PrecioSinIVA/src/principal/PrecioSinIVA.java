package principal;
import java.math.BigDecimal;

/*
 Escribe un programa que calcule el precio final de un producto según su
*     base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
*     reducido o superreducido) y el código promocional. Los tipos de IVA general,
*     reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
*     promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
*     respectivamente que no se aplica promoción, el precio se reduce a la mitad,
*     se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno
*     si se muestran los valores correctos, aunque los números no estén tabulados.
* 
*     Ejemplo:
*     Introduzca la base imponible: 25
*     Introduzca el tipo de IVA (general, reducido o superreducido): reducido
*     Introduzca el código promocional (nopro, mitad, meno5 o 5porc): mitad
*     Base imponible        		25.00
*     IVA (10%)              		  	  2.50
*     Precio con IVA          		27.50
*     Cód. promo. (mitad): 	-13.75
*     TOTAL                 				13.75
 */


public class PrecioSinIVA {
	
	//Las tabulaciones y espacios los hice como en el ejemplo, así que con otro ejemplo, descuadrarán. Se soluciona quitando los espacios sobrantes
	public static void main(String[] args) {
		double base = util.funciones.pedirDouble("Introduzca la base imponible: ");
		int porcientoIva = util.funciones.iva();
		double iva = base * porcientoIva / 100;
		double precioDouble = base + iva;
		BigDecimal precio = new BigDecimal(precioDouble);
		
		String codigoPromocional = util.funciones.codigoPromocional();
		BigDecimal codigoPromocionalNumero = util.funciones.codigoPromocionalNumero(precioDouble, codigoPromocional);
		
		System.out.print("Base imponible\t\t ");
		System.out.printf("%.2f", base);
		
		System.out.print("\nIVA (" + porcientoIva + "%)\t\t  ");
		System.out.printf("%.2f", base * porcientoIva / 100);
		
		System.out.print("\nPrecio con IVA\t\t ");
		System.out.printf("%.2f", precioDouble);
		
		System.out.print("\nCód. promo. (" + codigoPromocional + "):\t-");
		System.out.printf("%.2f", codigoPromocionalNumero);
		
		System.out.print("\nTOTAL\t\t\t ");
		System.out.printf("%.2f", precio.subtract(codigoPromocionalNumero));
	}

}
