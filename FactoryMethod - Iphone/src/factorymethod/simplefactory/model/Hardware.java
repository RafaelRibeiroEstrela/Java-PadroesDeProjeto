package factorymethod.simplefactory.model;

public class Hardware {
	
	private String processador;
	private String memoria;
	private String armazenamento;
	private String gpu;
	
	public Hardware() {
		
	}

	public Hardware(String processador, String memoria, String armazenamento, String gpu) {
		super();
		this.processador = processador;
		this.memoria = memoria;
		this.armazenamento = armazenamento;
		this.gpu = gpu;
	}

	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}

	public String getMemoria() {
		return memoria;
	}

	public void setMemoria(String memoria) {
		this.memoria = memoria;
	}

	public String getArmazenamento() {
		return armazenamento;
	}

	public void setArmazenamento(String armazenamento) {
		this.armazenamento = armazenamento;
	}

	public String getGpu() {
		return gpu;
	}

	public void setGpu(String gpu) {
		this.gpu = gpu;
	}

	@Override
	public String toString() {
		return "Hardware [processador=" + processador + ", memoria=" + memoria + ", armazenamento=" + armazenamento
				+ ", gpu=" + gpu + "]";
	}
	
	

}
