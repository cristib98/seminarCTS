package ro.ase.cts.simpleFactory.clase;

public class Factory {

	//de obicei simple factory este cu functie statica
	
	public static Jucator createJucator(TipJucator tip, String nume) throws Exception {
		switch(tip) {
			case Portar:
				return new Portar(nume);
			case Fundas:
				return new Fundas(nume);
			case Atacant:
				return new Atacant(nume);
			default:
				throw new Exception("Nu exista acest tip de jucator");
		}
	}
}
