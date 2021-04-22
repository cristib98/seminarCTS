package ro.ase.cts.strategy.clase;

public class Client {

	private String nume;
	private ModalitatePlata modalitatePlata;
	
	
	public void setModalitatePlata(ModalitatePlata modalitatePlata) {
		this.modalitatePlata = modalitatePlata;
	}


	public Client(String nume, ModalitatePlata modalitatePlata) {
		super();
		this.nume = nume;
		this.modalitatePlata = modalitatePlata;
	}
	
	public void achitaNota(float sumaDeAchitat) {
		System.out.println(nume + " are de platit nota in valoare de " + sumaDeAchitat + " lei.");
		modalitatePlata.achita(sumaDeAchitat);
		
	}
	
}
