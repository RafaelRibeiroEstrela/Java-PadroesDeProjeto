package factorymethod.simplefactory;

import factorymethod.simplefactory.factory.CarroFactory;
import factorymethod.simplefactory.models.Carro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro carro = CarroFactory.getCarro("cidade");
		
		System.out.println(carro);

	}

}
