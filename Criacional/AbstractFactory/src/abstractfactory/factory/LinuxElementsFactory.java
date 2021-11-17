package abstractfactory.factory;

import abstractfactory.classesconcretas.LinuxButton;
import abstractfactory.classesconcretas.LinuxCheckBox;
import abstractfactory.interfaces.Button;
import abstractfactory.interfaces.CheckBox;

public class LinuxElementsFactory implements ElementsFactory{

	@Override
	public Button createButton() {
		return new LinuxButton();
	}

	@Override
	public CheckBox createCheckBox() {
		return new LinuxCheckBox();
	}

}
