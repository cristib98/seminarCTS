package ro.ase.cts.adapter.clase;

public class AdapterBilet extends Bilet implements BiletOnline {

	public AdapterBilet(float pret) {
		super(pret);
	}

	@Override
	public void rezervaBiletOnline() {
		super.rezerva();
	}

	@Override
	public void vindeBiletOnline() {
		super.vinde();
	}
	

}
