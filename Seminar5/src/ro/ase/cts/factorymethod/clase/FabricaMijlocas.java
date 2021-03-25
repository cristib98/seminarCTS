package ro.ase.cts.factorymethod.clase;

public class FabricaMijlocas implements FabricaJucator {

	@Override
	public Jucator creareJucator(String nume) {
		return new Mijlocas(nume);
	}
	
	

}
