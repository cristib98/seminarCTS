package pachet;

import clase.Giraffe;
import clase.Zebra;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		
		Zoo zoo = new Zoo();
		
		Giraffe g1 = new Giraffe("Mihai", 300);
		Giraffe g2 = new Giraffe("Costel");
		Zebra z1 = new Zebra("Alina", 16);
		Zebra z2 = new Zebra("Elisabeta");
		
		
		zoo.addAnimal(g1);
		zoo.addAnimal(g2);
		zoo.addAnimal(z1);
		zoo.addAnimal(z2);
		
		zoo.feedAllAnimals();
		
	}

}
