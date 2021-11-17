package factorymethod.classesconcretas;

import factorymethod.interfaces.Button;

public class LinuxButton implements Button{

	@Override
	public void formato() {
		System.out.println("O formato do bot�o � de um Pinguin");
	}

	@Override
	public void acao() {
		System.out.println("O bot�o deve mostrar a mensagem: Bem vindo ao Linux!");
	}

}
