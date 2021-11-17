package factorymethod.factory;

import factorymethod.classesconcretas.WindowsButton;

public class WindowsButtonFactory implements ButtonFactory{

	@Override
	public WindowsButton createButton() {
		return new WindowsButton();
	}
	
	

}
