package dailimoshi.entity;

public class PhoneFactoryStatic{

	Phone phone;
	
	public static Phone getPhoneStaticProxy(String phoneName) {
		Phone phone;
		switch (phoneName) {
		case "iphoneX":
			phone = new PhoneProxy(new IphoneX());
			break;
		case "miMax":
			phone = new PhoneProxy(new MiMax());
			break;
		default:
			phone = null;
			break;
		}
		return phone;
	}
	
}
