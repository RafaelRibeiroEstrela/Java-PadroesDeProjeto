package factorymethod.simplefactory.factory;

import factorymethod.simplefactory.model.Aranha;
import factorymethod.simplefactory.model.Creeper;
import factorymethod.simplefactory.model.Mob;
import factorymethod.simplefactory.model.Zumbi;

public class MobFactory {
	
	public static Mob spawMob(String ambiente, String claridade) {
	
		Mob mob = null;
		
		
		if (ambiente.equals("fechado") && claridade.equals("escuro")){
			mob = new Zumbi();
		}
		else if (ambiente.equals("fechado")) {
			mob = new Creeper();
		}
		else if (ambiente.equals("aberto")) {
			mob = new Aranha();
		}
		
		return mob;
		
	}

}
