package generics1;

public class CotetGenericPorc<T extends Porc> {
	private T inhabitant;

	public T getInhabitant() {
		return inhabitant;
	}

	public void setInhabitant(T pObj) {
		inhabitant = pObj;
	}
}
