package ro.ase.cts.chain.program;

import ro.ase.cts.chain.clase.Cont;
import ro.ase.cts.chain.clase.ContCurent;
import ro.ase.cts.chain.clase.ContDeCredit;
import ro.ase.cts.chain.clase.ContEcoomii;
import ro.ase.cts.chain.clase.ContIndisponibil;

public class Program {

	public static void main(String[] args) {

		Cont contCurent = new ContCurent("Mariusica", 100);
		Cont contEconomii = new ContEcoomii("Gica", 200);
		Cont contCredit = new ContDeCredit("Alina", 500);
		Cont contIndisponibil = new ContIndisponibil("Aurel");
		
		
		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contCredit);
		contCredit.setSuccesor(contIndisponibil);
		
		contCurent.realizeazaPlata(60);
		contCurent.realizeazaPlata(140);
		contCurent.realizeazaPlata(300);
		contCurent.realizeazaPlata(600);
		
	}

}
