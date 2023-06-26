package pruebaGit;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class pruebaGit {

	/**
	 * Aqui podemos escribir lo que queramos que aparecerá Normalmente con poner lo
	 * que hace y los parametros para qué se piden, está bien, pero podemos poner
	 * mas cosas si queremos.
	 * 
	 * Podemos poner el orden que queramos en los @atributos, que luego se muestra
	 * en el orden correcto independientemente de cómo lo pongamos.
	 * 
	 * Por ejemplo, el autor debería de ir lo último, pero aquí lo pusimos antes.
	 * 
	 * @param cadena Sirve para poner una frase
	 * @param veces  Son las veces que se mostrará la frase
	 * @author n3bur
	 * @return String para ejecutarlo con System.out.println();
	 */
	public static String metodoPrueba(String cadena, int veces) {
		String frase = "";
		
		for (int i = 0; i <= veces; i++) {
			frase += cadena;
		}
		
		return frase;
	}
	
	public static BigDecimal calculateTotalAmount(BigDecimal quantity,BigDecimal unitPrice, BigDecimal discountRate, BigDecimal taxRate) { 
	    BigDecimal amount = quantity.multiply(unitPrice);
	    BigDecimal discount = amount.multiply(discountRate);
	    BigDecimal discountedAmount = amount.subtract(discount);
	    BigDecimal tax = discountedAmount.multiply(taxRate);
	    BigDecimal total = discountedAmount.add(tax);

	    // 2 decimales HALF_EVEN
	    BigDecimal roundedTotal = total.setScale(2, RoundingMode.HALF_EVEN);
	        
	    return roundedTotal;
	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println(metodoPrueba("Esto es una prueba", 3));
		
		BigDecimal bd = new BigDecimal("84.55");
		
		System.out.println(bd.setScale(1, RoundingMode.HALF_EVEN));
		System.out.println(bd.setScale(1, RoundingMode.HALF_DOWN));
		System.out.println(bd.setScale(1, RoundingMode.HALF_UP));
		System.out.println(bd.setScale(1, RoundingMode.CEILING));
		System.out.println(bd.setScale(1, RoundingMode.FLOOR));
		
		Thread.sleep(2000);

		System.out.print("Espera");
		Thread.sleep(750);
		System.out.print(".");
		Thread.sleep(750);
		System.out.print(".");
		Thread.sleep(750);
		System.out.print(".");

		Thread.sleep(8000); //Se pausa 8 segundos

		System.out.println("\nHas esperado mucho, gracias");
		
		BigInteger entero = new BigInteger("8000000000000"); //Esto no se podría con Integer ni int
		
		System.out.println(entero);
		
		StringBuffer test = new StringBuffer();
		
		test.append("Ahora algo");
		test.append("\nSimplemente práctico");
		
		System.out.println(test);
	}

}