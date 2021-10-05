package factorymethod.simplefactory;

import factorymethod.simplefactory.factory.IphoneSimpleFactory;
import factorymethod.simplefactory.model.Iphone;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Iphone iphone8 = IphoneSimpleFactory.getIphone("10", "pro");
		
		System.out.println(iphone8);
		
		
		

	}

}
