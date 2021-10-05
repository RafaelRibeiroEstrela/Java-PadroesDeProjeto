package factorymethod.simplefactory.factory;

import factorymethod.simplefactory.model.Iphone;
import factorymethod.simplefactory.model.Iphone10;
import factorymethod.simplefactory.model.Iphone12;
import factorymethod.simplefactory.model.Iphone8;

public class IphoneSimpleFactory {
	
	public static Iphone getIphone (String geracao, String versao) {
		
		Iphone device = null;
		
		if (geracao.equals("8")) {
			
			if (versao.equals("normal")) {
				device = new Iphone8("Iphone8", "NORMAL", "2008");
			} else if (versao.equals("pro")) {
				device = new Iphone8("Iphone8", "PRO", "2007");
			}
		} else if (geracao.equals("10")) {
			
			if (versao.equals("normal")) {
				device = new Iphone10("Iphone10", "NORMAL", "2010");
			} else if (versao.equals("pro")) {
				device = new Iphone10("Iphone10", "PRO", "2009");
			}
		}else if (geracao.equals("12")) {
			
			if (versao.equals("normal")) {
				device = new Iphone12("Iphone12", "NORMAL", "2012");
			} else if (versao.equals("pro")) {
				device = new Iphone12("Iphone12", "PRO", "2011");
			}
		}
		
		return device;
		
	}

}
