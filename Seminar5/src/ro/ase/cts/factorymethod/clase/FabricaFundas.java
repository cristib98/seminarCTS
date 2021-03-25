package ro.ase.cts.factorymethod.clase;

public class FabricaFundas implements FabricaJucator{
	
	@Override
	public Jucator creareJucator(String nume) {
		return new Fundas(nume);
	}

}
