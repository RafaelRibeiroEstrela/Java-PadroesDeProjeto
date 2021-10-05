package factorymethod.simplefactory.model;

public abstract class Mob {
	
	public abstract String nome();
	public abstract Integer vida();
	public abstract Poder poder();
	

	@Override
	public String toString() {
		return "Mob [nome=" + nome() + ", vida=" + vida() + "\n" + poder();
	}
	
	
	

}
