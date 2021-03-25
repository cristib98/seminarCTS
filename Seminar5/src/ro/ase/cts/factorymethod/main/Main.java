package ro.ase.cts.factorymethod.main;

import ro.ase.cts.factorymethod.clase.FabricaAtacant;
import ro.ase.cts.factorymethod.clase.FabricaFundas;
import ro.ase.cts.factorymethod.clase.FabricaJucator;
import ro.ase.cts.factorymethod.clase.FabricaMijlocas;
import ro.ase.cts.factorymethod.clase.Jucator;

public class Main {

	public static void afisareJucator(FabricaJucator fabrica, String nume) {
		
		Jucator jucator1 = fabrica.creareJucator(nume);
		System.out.println(jucator1);
		
		
	}
	
	public static void main(String[] args) {
		
		FabricaAtacant fabricaA = new FabricaAtacant();
		FabricaFundas fabricaF = new FabricaFundas();
		FabricaMijlocas fabricaM = new FabricaMijlocas();
		
		afisareJucator(fabricaA, "Vadim");
		afisareJucator(fabricaF, "Tudor");
		afisareJucator(fabricaM, "Mirel");
		

	}

}
