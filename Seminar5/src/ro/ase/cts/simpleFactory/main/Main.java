package ro.ase.cts.simpleFactory.main;

import ro.ase.cts.simpleFactory.clase.Factory;
import ro.ase.cts.simpleFactory.clase.Jucator;
import ro.ase.cts.simpleFactory.clase.TipJucator;

public class Main {

	public static void main(String[] args) {

		try {
			
			//Factory fabricaJucatori = new Factory(); (daca nu aveam metoda statica in Factory -> apelam prin numele obiectului nou creat)
			Jucator jucator1 = Factory.createJucator(TipJucator.Atacant, "Mirel");
			Jucator jucator2 = Factory.createJucator(TipJucator.Fundas, "Mihaita");
			System.out.println(jucator1.toString());
			System.out.println(jucator2.toString());

		} catch (Exception e) {
		}

	}

}
