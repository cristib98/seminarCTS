package ro.ase.cts.clase;

public class Cabana {
	// CABana - Cristian Alexandru Baban

	private String nume;
	private int numarCamere;
	private float pretPeNoapte;

	private static Cabana cabana = null;

	private Cabana(String nume, int numarCamere, float pretPeNoapte) {
		super();
		this.nume = nume;
		this.numarCamere = numarCamere;
		this.pretPeNoapte = pretPeNoapte;
	}

	public static synchronized Cabana getInstance(String nume, int numarCamere, float pretPeNoapte) {

		if (cabana == null) {
			cabana = new Cabana(nume, numarCamere, pretPeNoapte);
		}

		return cabana;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setNumarCamere(int numarCamere) {
		this.numarCamere = numarCamere;
	}

	public void setPretPeNoapte(float pretPeNoapte) {
		this.pretPeNoapte = pretPeNoapte;
	}

	public static void setCabana(Cabana cabana) {
		Cabana.cabana = cabana;
	}

	@Override
	public String toString() {
		return "Cabana [nume = " + nume + ", numarCamere = " + numarCamere + ", pretPeNoapte = " + pretPeNoapte + " lei]";
	}

}
