package ro.ase.cts.observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
	
	private List<Observer> observatori;

	public Subiect() {
		super();
		this.observatori = new ArrayList<>();
	}
	
	public void adaugaObserver(Observer observer) {
		observatori.add(observer);
	}
	
	public void stergeObserver(Observer observer) {
		observatori.remove(observer);
	}
	
	public void notificaClienti(String mesaj) {
		for (Observer o : observatori) {
			o.primesteNotificare(mesaj);
		}
	}
	
	
	

}
