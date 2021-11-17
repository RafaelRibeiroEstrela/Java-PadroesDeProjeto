package factorymethod.classesconcretas;

import factorymethod.interfaces.Button;

public class WindowsButton implements Button{

	@Override
	public void formato() {
		System.out.println("O botão tem o formato de janela");
	}

	@Override
	public void acao() {
		System.out.println("O botão deve imprimir a mensagem: Bem vindo ao Windows!");
	}

}
