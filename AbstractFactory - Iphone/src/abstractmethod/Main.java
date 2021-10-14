package abstractmethod;

import abstractmethod.factory.IphoneFactory;
import abstractmethod.model.Fone;
import abstractmethod.model.Iphone;

public class Main {

	public static void main(String[] args) {
		
		IphoneFactory iphoneFactory = new IphoneFactory();
		Iphone iphone= iphoneFactory.criarIphone("Iphone8");
		Fone fone = iphoneFactory.criarFone("Iphone8");
		
		System.out.println(iphone.getIphone());
		System.out.println(fone.getFone());
		
		
		

	}

}
