package abstractfactory;

import abstractfactory.factory.LinuxElementsFactory;
import abstractfactory.factory.WindowsElementsFactory;
import abstractfactory.interfaces.Button;
import abstractfactory.interfaces.CheckBox;

public class Main {

	public static void main(String[] args) {
		
		WindowsElementsFactory windows = new WindowsElementsFactory();
		LinuxElementsFactory linux = new LinuxElementsFactory();
		
		Button wButton = windows.createButton();
		Button lButton = linux.createButton();
		
		wButton.formato();
		lButton.formato();
		
		CheckBox wCheckBox = windows.createCheckBox();
		CheckBox lCheckBox = linux.createCheckBox();
		
		wCheckBox.numeroDeElementos();
		lCheckBox.numeroDeElementos();

	}

}
