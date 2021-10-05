package factorymethod.simplefactory.model;

public class Zumbi extends Mob{

	@Override
	public String nome() {
		return "Zumbi";
	}

	@Override
	public Integer vida() {
		return 75;
	}

	@Override
	public Poder poder() {
		return new Poder("Soco", 25);
	}
	
	

}
