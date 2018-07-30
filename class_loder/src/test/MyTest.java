package test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;

import entity.MyClassLoader;
import entity.MyClassLoader2;
import entity.Person;

public class MyTest {
	@Test
	public void test() throws Exception {
		MyClassLoader classLoader = new MyClassLoader("D:/");
        Class clazz = classLoader.loadClass("entity.tt");
        Object obj = clazz.newInstance();
        Method helloMethod = clazz.getDeclaredMethod("hello", null);
        helloMethod.invoke(obj, null);
        //-----------
        MyClassLoader classLoader2 = new MyClassLoader("D:/");
        Class clazz2 = classLoader2.loadClass("entity.tt");
        Object obj2 = clazz2.newInstance();
        Method helloMethod2 = clazz2.getDeclaredMethod("hello", null);
        helloMethod2.invoke(obj2, null);
        System.out.println(clazz.isInstance(clazz2));
        System.out.println(clazz.toString());
        System.out.println(clazz2.toString());
        System.out.println(clazz2.hashCode());
        System.out.println(clazz.hashCode());
        //Class c14 = Class.forName("entity.tt");
        Class c =Class.forName("entity.tt", false, classLoader);
        System.out.println(c.hashCode());
        Method hd = clazz2.getDeclaredMethod("getI", null);
        Class a= (Class) hd.invoke(obj2, null);
        System.out.println(a.hashCode());
        
        //34���ǻᱨ���,��Ϊûָ��������������»�ʹ��
        //Ĭ�ϼ�����Reflection.getCallerClass();
        //����ǵ����ߵļ�����,��ȥclassPath��,�����Ҳ���,��ĺ��ź���
        //����:ͬһ���������ص�ͬһ��class�ļ�Ϊ��������,��ͬ�ļ��������ص���ͬclass�ļ����ڴ��в�����ȵ�
        //tt��ķ���:public void hello(){syso("hehe");}
        //tt��ķ���:public Class getI(){return Class.forName("entity.tt");}
        
	}
	@Test
	public void tesqt() throws Exception {
		Person p1 = new Person();
		p1.setName("p1");
		Person p2 = new Person();
		p2.setName("p2");
		Person p3 = new Person();
		p3.setName("p3");
		List<Person> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.forEach((p)->{
			p.setName(p.getName() + "aa");
			System.out.println(p.getName());
			
			});
	}
	@Test
	public void tesaqt() throws Exception {
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(1);
			}
		}).start();
	}
	@Test
	public void teasaqt() throws Exception {
		new Thread(()->{
			System.out.println(1);
		}).start();
	}
	@Test
	public void teaasaqt() throws Exception {
		String[] players = {"Rafael Nadal", "Novak Djokovic",   
			    "Stanislas Wawrinka", "David Ferrer",  
			    "Roger Federer", "Andy Murray",  
			    "Tomas Berdych", "juan Martin Del Potro",  
			    "Richard Gasquet", "John Isner"};  
			   
			// 1.1 ʹ�������ڲ������ name ���� players  
			Arrays.sort(players, new Comparator<String>() {

				@Override
				public int compare(String o1, String o2) {
					// TODO Auto-generated method stub
					return 0;
				}  
			});
			for (String string : players) {
				System.out.println(string);
			}
			Arrays.sort(players, (String s1, String s2) -> (s2.compareTo(s1)));  
			for (String string : players) {
				System.out.println(string);
			}
	}
}
