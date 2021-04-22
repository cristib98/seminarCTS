package ro.ase.cts.state.clase;

public class Rezervata implements Stare {

	@Override
	public void schimbaStare(Masa masa) {
		if (masa.getStare() instanceof Libera) {
			System.out.println("Ati rezervat masa " + masa.getNr());
			masa.setStare(this);
		} else {
			System.out.println("Masa " + masa.getNr() + " nu poate fi rezervata.");
		}
	}

}
