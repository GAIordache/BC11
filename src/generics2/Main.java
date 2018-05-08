package generics2;

public class Main {
	public static void main(String[] args) {
		Turma<Lup> t1 = new Turma<>(new Lup[] {
			new Lup(),new Lup(),new Lup()	
		});
		Lup[] membri = t1.getMembri();
		
		CabinetMedicalUman<Copil> cmc = new CabinetMedicalUman<>();
		cmc.vaccineaza(new Copil());
		
		CabinetVeterinar<Oaia> cmo = new CabinetVeterinar<>();
		cmo.vaccineaza(new Oaia());
	}
}
