package abstractfactory.classesconcretas;

import abstractfactory.interfaces.CheckBox;

public class WindowsCheckBox implements CheckBox{

	@Override
	public void numeroDeElementos() {
		System.out.println("1500 elementos");
	}

}
