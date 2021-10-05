package factorymethod.simplefactory.model;

public class Creeper extends Mob{

	@Override
	public String nome() {
		return "Creeper";
	}

	@Override
	public Integer vida() {
		return 75;
	}

	@Override
	public Poder poder() {
		return new Poder("Explosão", 50);
	}
	
	

	

}
