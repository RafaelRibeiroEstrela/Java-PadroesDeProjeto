package abstractfactory.classesconcretas;

import abstractfactory.interfaces.Button;

public class WindowsButton implements Button{

	@Override
	public void formato() {
		System.out.println("O botão tem o formato do Windows");
	}

}
