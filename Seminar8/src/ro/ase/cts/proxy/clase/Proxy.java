package ro.ase.cts.proxy.clase;

public class Proxy implements IOperatorRezervare {
	
	private OperatorRezervare operator;
	private int nrMinimPersoane;
	
	
	

	public Proxy(OperatorRezervare operator, int nrMinimPersoane) {
		super();
		this.operator = operator;
		this.nrMinimPersoane = nrMinimPersoane;
	}




	@Override
	public void rezerva(int nrPers) {
		if(nrPers > nrMinimPersoane) {
			operator.rezerva(nrPers);
		}
		
		else {
			System.out.println("Nu s-a putut realiza rezervarea pentru " + nrPers + " persoane.");
		}
		
	}
	
	

}
