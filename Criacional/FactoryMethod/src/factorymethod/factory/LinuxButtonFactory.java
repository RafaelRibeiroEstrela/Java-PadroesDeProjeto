package factorymethod.factory;

import factorymethod.classesconcretas.LinuxButton;

public class LinuxButtonFactory implements ButtonFactory{

	@Override
	public LinuxButton createButton() {
		return new LinuxButton();	
	}

}
