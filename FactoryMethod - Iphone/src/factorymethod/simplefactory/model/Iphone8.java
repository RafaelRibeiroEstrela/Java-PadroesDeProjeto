package factorymethod.simplefactory.model;

public class Iphone8 extends Iphone{
	
	public Iphone8() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Iphone8(String nome, String versao, String ano) {
		super(nome, versao, ano);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Hardware getHardware() {
		return new Hardware("Intel core i5 10400", "8gb", "120gb", "RX580");
	}

	
}
