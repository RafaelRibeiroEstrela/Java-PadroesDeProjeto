package factorymethod.simplefactory.models;

public class Palio implements Carro{

	@Override
	public String getFabricante() {
		return "Fiat";
	}

	@Override
	public String getNome() {
		return "Palio";
	}

	@Override
	public String getVersao() {
		return "Basic";
	}

	@Override
	public Integer getAno() {
		return 2005;
	}

	@Override
	public Motor getMotor() {
		return new Motor(null, "1.0", 80);
	}

	@Override
	public String toString() {
		return "Fabricante = " + getFabricante() + ", Nome = " + getNome() + ", versão = " + getVersao() + 
				", Ano = " + getAno() + "\n" + getMotor();
	}
	
	

}
