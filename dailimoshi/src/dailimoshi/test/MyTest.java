package dailimoshi.test;

import org.junit.Test;

import dailimoshi.entity.Phone;
import dailimoshi.entity.PhoneFactoryDynamic;
import dailimoshi.entity.PhoneFactoryStatic;

public class MyTest {
	
	@Test
	public void staticProxyTest() {
		Phone iphone = PhoneFactoryStatic.getPhoneStaticProxy("iphoneX");
		iphone.call("1234567890");
		System.out.println(iphone.game());
		Phone miPhone = PhoneFactoryStatic.getPhoneStaticProxy("miMax");
		miPhone.call("1234567890");
		System.out.println(miPhone.game());
	}
	public static void main(String s[]) {
		Phone phone = PhoneFactoryDynamic.getPhoneDynamicProxy("iphoneX");
		phone.call("1234566");
		System.out.println(phone.game());
		System.out.println(phone.getClass());
	}
}
