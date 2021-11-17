package abstractfactory.factory;

import abstractfactory.interfaces.Button;
import abstractfactory.interfaces.CheckBox;

public interface ElementsFactory {
	
	Button createButton();
	CheckBox createCheckBox();

}
