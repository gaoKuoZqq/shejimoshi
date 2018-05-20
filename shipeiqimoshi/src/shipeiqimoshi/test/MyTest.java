package shipeiqimoshi.test;

import org.junit.Test;

import shipeiqimoshi.concept.User;
import shipeiqimoshi.concept.UserAdapter;
import shipeiqimoshi.concept.UserJsonServiceImpl;
import shipeiqimoshi.concept.UserService;
import shipeiqimoshi.concept.UserServiceImpl;

/**
 * userService�����еĹ��ܽӿ�,ʵ���˱���User
 * userService�ӿں���Ҫ,����Ϲ��
 * �����и�����,userService��Ҫ����Json����User
 * ��Ϊ������Ƶ��ټ̳�,��ʵ��,�ٸĶ�ԭ��,���Բ���������ģʽ
 * ���� : Ϊʲô������Ҫʵ��ԭ�нӿ�,�����ǳ���ԭ�нӿ�
 * �� : �������ԭ�нӿڲ������½ӿ�������ͬ,���ⲻ�Ǿ��Ե�
 */
public class MyTest {
	//��һ��,�����½ӿ�UserJsonService�Լ�ʵ����
	//�ڶ���,������������UserAdapter
	
	@Test
	public void myTest() {
		//ԭ�нӿڹ���
		UserService userService = new UserServiceImpl();
		System.out.println(userService.saveUser(new User()));
		
		UserAdapter userAdapter = new UserAdapter(new UserJsonServiceImpl());
		//�����¹���
		System.out.println(userAdapter.saveUser("{'user':{'username':'sb','password':'123'}}"));
		
		//����ԭ�й���
		System.out.println(userAdapter.saveUser(new User()));
	}
	
	
}
