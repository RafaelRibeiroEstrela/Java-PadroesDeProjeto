package factorymethod.simplefactory.models;

public class Fox implements Carro{
	
	@Override
	public String getFabricante() {
		return "Wolskvagem";
	}

	@Override
	public String getNome() {
		return "Fox";
	}

	@Override
	public String getVersao() {
		return "XL";
	}

	@Override
	public Integer getAno() {
		return 2010;
	}

	@Override
	public Motor getMotor() {
		return new Motor(null, "1.6", 105);
	}
	
	@Override
	public String toString() {
		return "Fabricante = " + getFabricante() + ", Nome = " + getNome() + ", versão = " + getVersao() + 
				", Ano = " + getAno() + "\n" + getMotor();
	}


}
