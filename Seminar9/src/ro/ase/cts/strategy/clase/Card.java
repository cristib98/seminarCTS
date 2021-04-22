package ro.ase.cts.strategy.clase;

public class Card implements ModalitatePlata {

	private float sumaSold;
	
	
	
	
	public Card(float sumaSold) {
		super();
		this.sumaSold = sumaSold;
	}




	@Override
	public void achita(float sumaDeAchitat) {
		
		if(sumaDeAchitat <= sumaSold) {
			System.out.println("S-a realizat plata cu cardul. Suma achitata: " + sumaDeAchitat + " lei.");
			sumaSold = sumaSold - sumaDeAchitat;
		}
		else {
			System.out.println("Fonduri insuficiente.");
		}
			
		
	}
	
	

}
