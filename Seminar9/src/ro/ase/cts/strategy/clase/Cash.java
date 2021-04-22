package ro.ase.cts.strategy.clase;

public class Cash implements ModalitatePlata {

	@Override
	public void achita(float sumaDeAchitat) {
		System.out.println("S-a realizat plata cash. Suma achitata: " + sumaDeAchitat + " lei.");
	}
	
	

}
