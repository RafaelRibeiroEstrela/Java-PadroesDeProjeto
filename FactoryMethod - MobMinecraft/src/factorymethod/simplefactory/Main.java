package factorymethod.simplefactory;

import factorymethod.simplefactory.factory.MobFactory;
import factorymethod.simplefactory.model.Mob;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mob mob1 = MobFactory.spawMob("fechado", "escuro");
		
		System.out.println(mob1);

	}

}
