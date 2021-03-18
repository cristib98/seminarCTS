package ro.ase.cts.program;

import ro.ase.cts.clase.Cabana;
import ro.ase.cts.clase.ManagerSpital;
import ro.ase.cts.clase.ManagerSpitalLazy;

public class Main {

	public static void main(String[] args) {
		ManagerSpital manager1 = ManagerSpital.getInstance();
		ManagerSpital manager2 = ManagerSpital.getInstance();

		System.out.println(manager1.toString());
		System.out.println(manager2.toString());

		ManagerSpitalLazy managerLazy1 = ManagerSpitalLazy.getInstance("Manager lazy", 33, 2334);
		ManagerSpitalLazy managerLazy2 = ManagerSpitalLazy.getInstance("Ionescu Mihai", 36, 5133);


		System.out.println(managerLazy1.toString());
		System.out.println(managerLazy2.toString());
	
		System.out.println("\n------------------------------------------------------\n");
		
		Cabana cabana1 = Cabana.getInstance("Busteni", 5, 70.5f);
		Cabana cabana2 = Cabana.getInstance("Cerbul", 6, 90f);
		
		cabana1.setNumarCamere(10);

		System.out.println(cabana1.toString());
		System.out.println(cabana2.toString());

	}

}
