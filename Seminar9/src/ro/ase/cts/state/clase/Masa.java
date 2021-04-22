package ro.ase.cts.state.clase;

public class Masa {

	private int nr;
	private Stare stare;

	public Masa(int nr) {
		super();
		this.nr = nr;
		this.stare = new Libera();
	}

	public int getNr() {
		return nr;
	}

	public void setNr(int nr) {
		this.nr = nr;
	}

	public Stare getStare() {
		return stare;
	}

	void setStare(Stare stare) {
		this.stare = stare;
	}

	public void rezerva() {
		Rezervata rezervata = new Rezervata();
		rezervata.schimbaStare(this);
	}

	public void ocupa() {
		Ocupata ocupata = new Ocupata();
		ocupata.schimbaStare(this);
	}

	public void elibereaza() {
		Libera libera = new Libera();
		libera.schimbaStare(this);
	}

}
