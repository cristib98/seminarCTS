package ro.ase.cts.program;

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
		
		managerLazy1.setVarsta(44);
		managerLazy2.setNume("John");
		
		System.out.println(managerLazy1.toString());
		System.out.println(managerLazy2.toString());
	}

}
