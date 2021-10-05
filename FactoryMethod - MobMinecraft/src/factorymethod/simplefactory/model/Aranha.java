package factorymethod.simplefactory.model;

public class Aranha extends Mob{

	@Override
	public String nome() {
		return "Aranha";
	}

	@Override
	public Integer vida() {
		return 50;
	}

	@Override
	public Poder poder() {
		return new Poder("Veneno", 35);
	}
	
	
	

}
