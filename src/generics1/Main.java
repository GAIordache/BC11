package generics1;

public class Main {
	public static void main(String[] args) {
		Cotet cporc = new Cotet();
		//cporc.setInhabitant(new Iguana()); // NASPA 
		cporc.setInhabitant(new Porc());
		Cotet cgaina = new Cotet();
		cgaina.setInhabitant(new Gaina());
		Object chirias = cporc.getInhabitant();
		if(chirias instanceof Porc) {
			Porc porc = (Porc)cporc.getInhabitant();
		}
		// Take two
		CotetPentruPorc c1porc = new CotetPentruPorc();
		c1porc.setInhabitant(new Porc());
		Porc p1 = c1porc.getInhabitant();
		// Take three
		CotetGeneric<Porc> c2porc = new CotetGeneric<>();
		c2porc.setInhabitant(new Porc());
		Porc p2 = c2porc.getInhabitant();
		
		CotetGeneric<Gaina> cgaina1 = new CotetGeneric<>();
		cgaina1.setInhabitant(new Gaina());
		Gaina g2 = cgaina1.getInhabitant();
		//
		CotetGenericPorc<Bazna> cp1 = new CotetGenericPorc<>();
		cp1.setInhabitant(new Bazna());
		Bazna p3 = cp1.getInhabitant();
	}
}
