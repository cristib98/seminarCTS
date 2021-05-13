package ro.ase.cts.observer.clase;

public class ManagerSala extends Subiect {
	
	public void anuntaMeciFotbal() {
		super.notificaClienti("Meci nou de fotbal la orizont!");
	}
	
	public void anuntaMeciHandbal() {
		super.notificaClienti("Meci nou de handbal la orizont!");
	}
	
	public void anuntaMeciVolei() {
		super.notificaClienti("Meci nou de volei la orizont!");
	}

}
