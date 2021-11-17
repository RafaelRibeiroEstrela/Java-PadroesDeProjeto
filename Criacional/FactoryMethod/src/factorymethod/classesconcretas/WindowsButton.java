package factorymethod.classesconcretas;

import factorymethod.interfaces.Button;

public class WindowsButton implements Button{

	@Override
	public void formato() {
		System.out.println("O bot�o tem o formato de janela");
	}

	@Override
	public void acao() {
		System.out.println("O bot�o deve imprimir a mensagem: Bem vindo ao Windows!");
	}

}
