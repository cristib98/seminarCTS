package ro.ase.cts.adapter.program;

import ro.ase.cts.adapter.clase.AdapterBilet;
import ro.ase.cts.adapter.clase.Bilet;
import ro.ase.cts.adapter.clase.BiletOnline;

public class Main {

	public static void rezervaSiVindeBiletOnline(BiletOnline biletOnline) {
		biletOnline.rezervaBiletOnline();
		biletOnline.vindeBiletOnline();
	}
	
	public static void rezervaSiVindeBiletFizic(Bilet bilet) {
		bilet.rezerva();
		bilet.vinde();
	}
	
	
	public static void main(String[] args) {
		
		Bilet bilet = new Bilet(79);
		rezervaSiVindeBiletFizic(bilet);
		
		System.out.println("----------------------------------------");
		
		BiletOnline biletOnline = new AdapterBilet(33);
		
		rezervaSiVindeBiletOnline(biletOnline);
		
	}

}
