package genericos;

import java.util.Arrays;

public class PilaArray<T> implements iPila<T> {
	private T [] lista;
	private int contador;

	public PilaArray() {
		this.lista = (T[]) new Object[0];
	}

	@Override
	public boolean estaVacia() {
		boolean vacio = false;
		
		if (lista.length == 0) {
			vacio = true;
		}
		
		return vacio;
	}

	@Override
	public T extraer() {
		T elemento = null;
		
		if (!estaVacia()) {
			elemento = lista[lista.length - 1]; //ultimo elemento
			lista = Arrays.copyOf(lista, lista.length - 1); //Achicamos 1
			
			contador--;
		}
		
		return elemento;
	}

	@Override
	public T primero() {
		T elemento = null;
		
		if (lista.length > 0) {
			elemento = lista[0];
		}
		
		return elemento;
	}

	@Override
	public void anadir(T elemento) {
		if (estaVacia()) {
			lista = (T[]) new Object[1];
			lista[lista.length - 1] = elemento;
		} else {
			lista = Arrays.copyOf(lista, lista.length + 1);
			
			lista[lista.length - 1] = elemento;
		}
		
		contador++;
	}

	@Override
	public String toString() {
		return "PilaArray [lista=" + Arrays.toString(lista) + ", contador=" + contador + "]";
	}
	
}