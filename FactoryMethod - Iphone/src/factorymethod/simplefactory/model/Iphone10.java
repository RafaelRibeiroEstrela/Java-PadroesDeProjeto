package factorymethod.simplefactory.model;

public class Iphone10 extends Iphone{
	
	

	public Iphone10() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Iphone10(String nome, String versao, String ano) {
		super(nome, versao, ano);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Hardware getHardware() {
		return new Hardware("RYZEN 5 5600X", "10gb", "256gb", "RTX 2060");
	}

}
