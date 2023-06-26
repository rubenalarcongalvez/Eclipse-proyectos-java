package genericos;

public class principal {

	public static void main(String[] args) {

		PilaArray<Integer> pila = new PilaArray();

		System.out.println(pila.toString());

		pila.anadir(3);
		pila.anadir(8);

		System.out.println(pila.toString());

		pila.extraer();

		System.out.println(pila.toString());

		pila.extraer();

		System.out.println(pila.toString());

		pila.extraer(); //Ya no podrá porque no hay

		System.out.println(pila.toString());
	}

}