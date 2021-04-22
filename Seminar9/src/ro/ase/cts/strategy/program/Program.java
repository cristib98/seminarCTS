package ro.ase.cts.strategy.program;

import ro.ase.cts.strategy.clase.Card;
import ro.ase.cts.strategy.clase.Cash;
import ro.ase.cts.strategy.clase.Client;
import ro.ase.cts.strategy.clase.ModalitatePlata;

public class Program {

	public static void main(String[] args) {
		
		Card card = new Card(73);
		Client client = new Client("Mete-Emre", card);
		
		client.achitaNota(50);
		
		Cash cash = new Cash();
		
		client.setModalitatePlata(cash);
		client.achitaNota(40);
		
		client.setModalitatePlata(card);
		client.achitaNota(30);
		
		
	}

}
