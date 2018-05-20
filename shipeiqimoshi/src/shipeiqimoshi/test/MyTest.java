package shipeiqimoshi.test;

import org.junit.Test;

import shipeiqimoshi.concept.User;
import shipeiqimoshi.concept.UserAdapter;
import shipeiqimoshi.concept.UserJsonServiceImpl;
import shipeiqimoshi.concept.UserService;
import shipeiqimoshi.concept.UserServiceImpl;

/**
 * userService是已有的功能接口,实现了保存User
 * userService接口很重要,不能瞎改
 * 现在有个需求,userService需要保存Json对象User
 * 因为代码设计的少继承,多实现,少改动原则,所以采用适配器模式
 * 问题 : 为什么适配器要实现原有接口,而不是持有原有接口
 * 答案 : 这个例子原有接口参数与新接口类型相同,但这不是绝对的
 */
public class MyTest {
	//第一步,创建新接口UserJsonService以及实现类
	//第二步,创建适配器类UserAdapter
	
	@Test
	public void myTest() {
		//原有接口功能
		UserService userService = new UserServiceImpl();
		System.out.println(userService.saveUser(new User()));
		
		UserAdapter userAdapter = new UserAdapter(new UserJsonServiceImpl());
		//测试新功能
		System.out.println(userAdapter.saveUser("{'user':{'username':'sb','password':'123'}}"));
		
		//测试原有功能
		System.out.println(userAdapter.saveUser(new User()));
	}
	
	
}
