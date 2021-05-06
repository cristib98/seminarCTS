package ro.ase.cts.chain.clase;

public class ContEcoomii extends Cont {

	
	
	public ContEcoomii(String detinator, float sold) {
		super(detinator, sold);
	}

	@Override
	public void realizeazaPlata(float suma) {
		if (super.getSold() > suma) {
			System.out.println("A fost realizata plata de " + suma + " lei, din contul economii.");
			super.setSold(super.getSold()-suma);
		}
		else {
			super.getSuccesor().realizeazaPlata(suma);
		}
		
	}
	
	

}
