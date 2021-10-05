package factorymethod.simplefactory.factory;

import factorymethod.simplefactory.models.Carro;
import factorymethod.simplefactory.models.Fox;
import factorymethod.simplefactory.models.Palio;

public class CarroFactory {
	
	public static Carro getCarro(String local) {
		
		Carro carro = null;
		
		
		if (local.equals("cidade")) {
			carro = new Palio();
		}else {
			carro = new Fox();
		}
		
		return carro;	
	}
	
	

}
