package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.clase.Client;
import ro.ase.cts.flyweight.clase.FlyweightFactory;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Program {

	public static void main(String[] args) {
		Rezervare rezervare1 = new Rezervare(1, 4, 10);
		Rezervare rezervare2 = new Rezervare(2, 3, 11);
		Rezervare rezervare3 = new Rezervare(4, 2, 12);
		
		FlyweightFactory flyweightFactory = new FlyweightFactory();
		
		Client client1 = (Client) flyweightFactory.getClient("0700000000");
		Client client2 = (Client) flyweightFactory.getClient("0711111111");
		client1.afiseazaInformatii(rezervare1);
		client2.afiseazaInformatii(rezervare2);
		flyweightFactory.getClient("0700000000").afiseazaInformatii(rezervare3);

	}

}
