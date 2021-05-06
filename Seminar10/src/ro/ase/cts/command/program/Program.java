package ro.ase.cts.command.program;

import ro.ase.cts.command.clase.ComandaConstituire;
import ro.ase.cts.command.clase.ComandaDepunere;
import ro.ase.cts.command.clase.ComandaRetragere;
import ro.ase.cts.command.clase.ContBancar;
import ro.ase.cts.command.clase.ManagerComenzi;

public class Program {

	public static void main(String[] args) {

		ContBancar contBancar1 = new ContBancar("Marius");
		ManagerComenzi manager = new ManagerComenzi();
		
		manager.invocaComanda(new ComandaConstituire(contBancar1, 100));
		manager.invocaComanda(new ComandaDepunere(contBancar1, 20));
		manager.executaComanda();
		manager.invocaComanda(new ComandaRetragere(contBancar1, 40));
		manager.executaComanda();
		manager.executaComanda();
		
		
	}

}
