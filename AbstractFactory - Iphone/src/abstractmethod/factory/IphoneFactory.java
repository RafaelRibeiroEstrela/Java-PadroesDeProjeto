package abstractmethod.factory;

import abstractmethod.model.Fone;
import abstractmethod.model.FoneX50;
import abstractmethod.model.Iphone;
import abstractmethod.model.Iphone8;

public class IphoneFactory implements AbstractFactory{

	@Override
	public Iphone criarIphone(String nome) {
		if (nome.equals("Iphone8")) {
			return new Iphone8();
		}
		return null;
	}

	@Override
	public Fone criarFone(String nome) {
		if (nome.equals("Iphone8")) {
			return new FoneX50();
		}
		return null;
	}
	
	
	

}
