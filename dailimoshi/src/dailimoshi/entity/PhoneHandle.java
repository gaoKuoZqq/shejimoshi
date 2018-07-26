package dailimoshi.entity;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PhoneHandle implements InvocationHandler{

	Phone phone;
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if (method.getName().equals("call")) {
			args[0] = "+86 " + args[0];
		}else if (method.getName().equals("game")) {
			System.out.println("ÕýÔÚ²âÊÔÖ¡ÂÊ");
		}
		Object obj = method.invoke(phone, args);
		return obj;
	}
	public PhoneHandle(Phone phone) {
		super();
		this.phone = phone;
	}

}
