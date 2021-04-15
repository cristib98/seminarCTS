package ro.ase.cts.flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	private Map<String, FlyweighAbstract> clienti;
	
	public FlyweightFactory() {
		clienti = new HashMap<>();
	}
	
	public FlyweighAbstract getClient(String numarTelefon) {
		Client client = (Client) clienti.get(numarTelefon);
		if (client == null) {
			client = new Client("Mihai", numarTelefon, "mihaita@gmail.com");
			clienti.put(numarTelefon, client);
		}
		return client;
	}
	
}
