package factorymethod.simplefactory.models;

public interface Carro {
	
	public String getFabricante();
	public String getNome();
	public String getVersao();
	public Integer getAno();
	public Motor getMotor();
	public String toString();

}
