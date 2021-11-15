package factorymethod.classesconcretas;

import factorymethod.interfaces.Button;

public class LinuxButton implements Button{

	@Override
	public void formato() {
		System.out.println("O formato do botão é de um Pinguin");
	}

	@Override
	public void acao() {
		System.out.println("O botão deve mostrar a mensagem: Bem vindo ao Linux!");
	}

}
