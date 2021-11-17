package abstractfactory.classesconcretas;

import abstractfactory.interfaces.Button;

public class LinuxButton implements Button{

	@Override
	public void formato() {
		System.out.println("O bot�o tem o formato do Linux");
	}

}
