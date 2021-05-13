package ro.ase.cts.template.program;

import ro.ase.cts.template.clase.SpectatorCuHandicap;
import ro.ase.cts.template.clase.SpectatorUzual;
import ro.ase.cts.template.clase.TemplateIntrareStadion;

public class Program {

	public static void main(String[] args) {
		
		TemplateIntrareStadion spectator1 = new SpectatorUzual("Alin");
		TemplateIntrareStadion spectator2 = new SpectatorCuHandicap("George");
		
		spectator1.intrareStadion();
		System.out.println("---------------------------------------------");
		spectator2.intrareStadion();
		
	}

}
