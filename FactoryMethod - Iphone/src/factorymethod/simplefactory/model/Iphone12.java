package factorymethod.simplefactory.model;

public class Iphone12 extends Iphone{
	
	

	public Iphone12() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Iphone12(String nome, String versao, String ano) {
		super(nome, versao, ano);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Hardware getHardware() {
		return new Hardware("INTEL CORE I9 11900K", "16gb", "512gb", "RTX 2080");
	}

}
