package abstractfactory.classesconcretas;

import abstractfactory.interfaces.Button;

public class LinuxButton implements Button{

	@Override
	public void formato() {
		System.out.println("O botão tem o formato do Linux");
	}

}
