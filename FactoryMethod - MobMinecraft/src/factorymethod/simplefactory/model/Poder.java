package factorymethod.simplefactory.model;

public class Poder {
	
	private String nome;
	private Integer dano;
	
	public Poder() {
		
	}

	public Poder(String nome, Integer dano) {
		super();
		this.nome = nome;
		this.dano = dano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getDano() {
		return dano;
	}

	public void setDano(Integer dano) {
		this.dano = dano;
	}

	@Override
	public String toString() {
		return "Poder [nome=" + nome + ", dano=" + dano + "]";
	}
	
	
	

}
