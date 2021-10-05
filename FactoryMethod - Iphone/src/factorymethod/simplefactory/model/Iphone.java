package factorymethod.simplefactory.model;

public abstract class Iphone {
	
	private String nome;
	private String versao;
	private String ano;
	
	public abstract Hardware getHardware();
	
	public Iphone() {
		
	}

	public Iphone(String nome, String versao, String ano) {
		super();
		this.nome = nome;
		this.versao = versao;
		this.ano = ano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	@Override
	public String toString() {
		return "Iphone [nome=" + nome + ", versao=" + versao + ", ano=" + ano + "]" + "\n" + getHardware();
	}
	
	
	
	

}
