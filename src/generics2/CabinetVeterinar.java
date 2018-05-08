package generics2;

public class CabinetVeterinar<T extends Animal> implements CabinetMedical<T> {

	@Override
	public void vaccineaza(T subiectVaccinare) {
		// TODO Auto-generated method stub
		
	}
	
	public <M> void setCeva(M pCeva) {
	}

}
