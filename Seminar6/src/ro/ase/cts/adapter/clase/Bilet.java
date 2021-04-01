package ro.ase.cts.adapter.clase;

public class Bilet {
	
	private float pret;

	public Bilet(float pret) {
		super();
		this.pret = pret;
	}
	
	public void rezerva() {
		System.out.println("Biletul a fost rezervat. Pret: " + pret + " lei.");
	}
	
	public void vinde() {
		System.out.println("Biletul a fost vandut. Pret: " + pret + " lei.");
	}
	
}
