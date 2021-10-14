package abstractmethod.factory;

import abstractmethod.model.Fone;
import abstractmethod.model.Iphone;

public interface AbstractFactory {
	
	public Iphone criarIphone(String nome);
	public Fone criarFone(String nome);

}
