package ro.ase.cts.command.clase;

public class ContBancar {

	private String detinator;
	private float sold;

	public ContBancar(String detinator) {
		super();
		this.detinator = detinator;
	}

	public void constituire(float suma) {
		System.out.println("A fost constituit contul cu suma de " + suma + " lei.");
		sold = suma;
	}

	public void retragere(float suma) {
		if (suma <= sold) {
			System.out.println("A fost retrasa suma de " + suma + " lei din cont.");
			sold -= suma;
		} else {
			System.out.println("Sold-ul este prea mic pentru a extrage suma de " + suma + " lei.");
		}
	}

	public void depunere(float suma) {
		System.out.println("A fost depusa suma de " + suma + " lei in cont.");
		sold += suma;
	}

}
