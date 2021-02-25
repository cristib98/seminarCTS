package pachet;

import clase.Giraffe;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		
		Zoo zoo = new Zoo();
		
		Giraffe g1 = new Giraffe("Mihai", 300);
		Giraffe g2 = new Giraffe("Costel");
		
		zoo.addAnimal(g1);
		zoo.addAnimal(g2);
		
		zoo.feedAllAnimals();
		
	}

}
