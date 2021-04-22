package ro.ase.cts.state.clase;

public class Ocupata implements Stare {

	@Override
	public void schimbaStare(Masa masa) {
		if(!(masa.getStare() instanceof Ocupata)) {
			masa.setStare(this);
			System.out.println("Masa " + masa.getNr() + " a fost ocupata.");
		}
		else {
			System.out.println("Masa nu poate if ocupata!");
		}
	}

}
