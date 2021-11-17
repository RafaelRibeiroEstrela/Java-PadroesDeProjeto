package factorymethod;

import factorymethod.classesconcretas.LinuxButton;
import factorymethod.classesconcretas.WindowsButton;
import factorymethod.factory.LinuxButtonFactory;
import factorymethod.factory.WindowsButtonFactory;

public class Main {

	public static void main(String[] args) {
		
		LinuxButtonFactory linuxButtonFactory = new LinuxButtonFactory();
		WindowsButtonFactory windowsButtonFactory = new WindowsButtonFactory();
		
		LinuxButton linuxButton = linuxButtonFactory.createButton();
		WindowsButton windowsButton = windowsButtonFactory.createButton();
		
		linuxButton.acao();
		windowsButton.acao();

	}

}
