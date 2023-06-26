package genericos;

public interface iPila<T> {
	boolean estaVacia();
	
	public T extraer();
	
	public T primero();
	
	public void anadir(T elemento);
	
}