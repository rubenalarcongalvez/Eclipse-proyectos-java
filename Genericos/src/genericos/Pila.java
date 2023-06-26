package genericos;

import java.util.LinkedList;

public class Pila<T> {
	private LinkedList<T> lista;

	public Pila(LinkedList<T> lista) {
		this.lista = lista;
	}

	public LinkedList<T> getLista() {
		return lista;
	}

	public void setLista(LinkedList<T> lista) {
		this.lista = lista;
	}

	public boolean estaVacia() {
		return lista.isEmpty();
	}
	
	public T extraer() {
		return lista.poll();
	}
	
	public void anadir(T elemento) {
		lista.push(elemento);
	}
	
}