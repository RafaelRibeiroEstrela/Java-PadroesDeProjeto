package abstractfactory.classesconcretas;

import abstractfactory.interfaces.CheckBox;

public class LinuxCheckBox implements CheckBox{

	@Override
	public void numeroDeElementos() {
		System.out.println("1000 elementos");
	}

}
