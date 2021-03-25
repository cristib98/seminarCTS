package ro.ase.cts.factorymethod.clase;

public class FabricaPortar implements FabricaJucator {

	@Override
	public Jucator creareJucator(String nume) {
		return new Portar(nume);
	}

}
