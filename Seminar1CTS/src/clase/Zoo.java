package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private Zookeeper zookeeper;
	private List<Animal> animals;

	public Zoo(Zookeeper zookeeper, List<Animal> animals) {
		super();
		this.zookeeper = zookeeper;
		this.animals = animals;
	}

	public Zoo() {
		this.zookeeper = new Zookeeper();
		this.zookeeper.setName("Gigel");
		this.animals = new ArrayList<>(); // nu e obligatoriu sa punem Animal intre <>
	} // list e abstract, nu putem initiala cu clasa abstracta

	public void addAnimal(Animal a) {
		this.animals.add(a);
	}

	public Zookeeper getZookeeper() {
		return zookeeper;
	}

	public void setZookeeper(Zookeeper zookeeper) {
		this.zookeeper = zookeeper;
	}

	public List<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}

	public void feedAllAnimals() {

		for (Animal a : animals) {
			zookeeper.feed(a);
		}

	}

}
