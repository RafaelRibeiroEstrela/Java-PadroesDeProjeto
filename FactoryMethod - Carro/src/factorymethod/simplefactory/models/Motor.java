package factorymethod.simplefactory.models;

public class Motor {
	
	private String nome;
	private String potencia;
	private Integer cavalos;
	
	public Motor() {
		
	}

	public Motor(String nome, String potencia, Integer cavalos) {
		super();
		this.nome = nome;
		this.potencia = potencia;
		this.cavalos = cavalos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPotencia() {
		return potencia;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Motor [nome=" + nome + ", potencia=" + potencia + ", cavalos=" + cavalos + "]";
	}

}
