package ro.ase.cts.factorymethod.clase;

public class Atacant extends Jucator {

	public Atacant(String nume) {
		super(nume);
	}
	
	@Override
	public String toString() {
		return "Atacant [nume : " + getNume() + "]";
	}
	
}
