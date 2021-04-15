package ro.ase.cts.proxy.program;

import ro.ase.cts.proxy.clase.OperatorRezervare;
import ro.ase.cts.proxy.clase.Proxy;

public class Program {

	public static void main(String[] args) {
		OperatorRezervare operator1 = new OperatorRezervare("Local");
		operator1.rezerva(3);

		System.out.println("---------------------------------");

		Proxy proxy = new Proxy(operator1, 4);
		proxy.rezerva(3);
		System.out.println("---------------------------------");
		proxy.rezerva(5);

	}

}
