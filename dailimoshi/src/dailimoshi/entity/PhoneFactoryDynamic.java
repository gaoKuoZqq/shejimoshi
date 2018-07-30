package dailimoshi.entity;

import java.lang.reflect.Proxy;

public class PhoneFactoryDynamic{

	Phone phone;
	

	public static Phone getPhoneDynamicProxy(String phoneName) {
		Phone phone;
		switch (phoneName) {
		case "iphoneX":
			phone = new IphoneX();
			break;
		case "miMax":
			phone = new MiMax();
			break;
		default:
			phone = null;
			break;
		}
		 System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		Phone proxy = (Phone) Proxy.newProxyInstance(phone.getClass().getClassLoader(),
				phone.getClass().getInterfaces(), new PhoneHandle(phone));
		return proxy;
	}
	
}
