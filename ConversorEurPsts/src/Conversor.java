import java.math.BigDecimal;
import java.math.RoundingMode;

public class Conversor {

	public static void main(String[] args) {
		int pesetas = 1000;
		double euros = pesetas / 166.386;
		
		System.out.println(pesetas + " pesetas son " + euros + " euros.");
		//Para mostrar dos decimales se puede usar "printf"
		//en lugar de "print" o "println"
		
		System.out.printf("%d pesetas son %.2f euros.\n", pesetas, euros);
		
		System.out.println("**División BigDecimal: ");
		BigDecimal cantidadPts = new BigDecimal(1000);
		BigDecimal factor = new BigDecimal(166.386);
		BigDecimal cantidadEur = cantidadPts.divide(factor, 10, RoundingMode.HALF_UP);
		
		System.out.println("Cantidad Eur " + cantidadEur.toPlainString());
	}

}