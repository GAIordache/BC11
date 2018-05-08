package generics1;

public class CotetGeneric<AN> {
	private AN inhabitant;

	public AN getInhabitant() {
		return inhabitant;
	}

	public void setInhabitant(AN pObj) {
		inhabitant = pObj;
	}
}
