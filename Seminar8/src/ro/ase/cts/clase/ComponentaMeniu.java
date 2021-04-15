package ro.ase.cts.clase;

public interface ComponentaMeniu {
	
	void adaugareNod(ComponentaMeniu componenta);
	void stergereNod(ComponentaMeniu componenta);
	void afiseazaInformatii();
	ComponentaMeniu getComponenta(int index) throws Exception;

}
