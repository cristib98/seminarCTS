package ro.ase.cts.factorymethod.clase;

public class FabricaAtacant implements FabricaJucator {
	
	@Override
	public Jucator creareJucator(String nume) {
		return new Atacant(nume);
	}

}
