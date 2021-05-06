package ro.ase.cts.command.clase;

public class ComandaConstituire extends Command {
	
	
	public ComandaConstituire(ContBancar contBancar, float suma) {
		super(contBancar, suma);
	}

	@Override
	public void executa() {
		super.getContBancar().constituire(super.getSuma());
		
	}
	
	

}
