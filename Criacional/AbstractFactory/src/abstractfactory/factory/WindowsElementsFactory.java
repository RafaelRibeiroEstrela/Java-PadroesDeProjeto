package abstractfactory.factory;

import abstractfactory.classesconcretas.WindowsButton;
import abstractfactory.classesconcretas.WindowsCheckBox;
import abstractfactory.interfaces.Button;
import abstractfactory.interfaces.CheckBox;

public class WindowsElementsFactory implements ElementsFactory{

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public CheckBox createCheckBox() {
		return new WindowsCheckBox();
	}

}
