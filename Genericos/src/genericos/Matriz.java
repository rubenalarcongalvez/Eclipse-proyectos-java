package genericos;

import java.util.Arrays;

/**
 * 
 * @author Rubén Alarcón
 *
 * @param <T>
 */

public class Matriz<T> {
	private T[][] matriz;
	private int filas;
	private int columnas;

	/**
	 * @param numFilas    Filas que haya
	 * @param numColumnas Columnas que haya
	 */
	public Matriz(int filas, int columnas) {
		this.matriz = (T[][]) new Object[filas][columnas];
	}

	public T getElemento(int fila, int columna) {
		return matriz[fila][columna];
	}

	public void setNumFilas(int fila, int columna, T elemento) {
		matriz[fila][columna] = elemento;
	}

	public int filas() {
		return matriz.length;
	}

	public int columnas() {
		return matriz[0].length;
	}

	@Override
	public String toString() {
		return Arrays.deepToString(matriz);
	}

}