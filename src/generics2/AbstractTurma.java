package generics2;

public abstract class AbstractTurma<T> {
	private T[] membri;
	
	public AbstractTurma(T[] pMembri) {
		membri = pMembri;
		//membri = new T[10];
		//T x = new T();
	}
	
	public T[] getMembri() {
		for(T t : membri) {
		}
		return membri;
	}
	
	public int size() {
		return membri.length;
	}
	
	public abstract void cevaAbstract();
}
