package abstractfactory.classesconcretas;

import abstractfactory.interfaces.Button;

public class WindowsButton implements Button{

	@Override
	public void formato() {
		System.out.println("O bot�o tem o formato do Windows");
	}

}
