package gongchangmoshi.test;

import org.junit.Test;

import gongchangmoshi.entity.coke.Coke;
import gongchangmoshi.entity.factory.AbstractFactory;
import gongchangmoshi.entity.factory.FoodFactory;
import gongchangmoshi.entity.factory.FruitFactory;
import gongchangmoshi.entity.fuiture.Apple;
import gongchangmoshi.entity.fuiture.Banana;
import gongchangmoshi.entity.fuiture.Fruit;

public class MyTest {

	//��ǰ,���ˮ��ֱ��Ҫ
	@Test
	public void myTestOld() {
		//��ͳģʽ
		//����������ƻ����
		Apple apple = new Apple();
		System.out.println("���ӳ�" + apple.toString());
		//�����������㽶��
		Banana banana = new Banana();
		System.out.println("���ӳ�" + banana.toString());
	}
	
	//����,���ˮ��ȥ�ҹ���Ҫ
	@Test
	public void myTestNow() {
		//����ģʽ
		//�ȸ���������ˮ������
		FruitFactory fruitFactory = new FruitFactory();
		//����������ƻ����
		Fruit apple = fruitFactory.getFruit("apple");
		System.out.println("���ӳ�" + apple.toString());
		//�����������㽶��
		Fruit banana = fruitFactory.getFruit("banana");
		System.out.println("���ӳ�" + banana.toString());
	}
	
	//�Ժ�,��һ�����ˮ����,����ˮ׼������,û׼Ҫ�ȿ���
	@Test
	public void myTestuture() {
		//���󹤳�ģʽ
		//�ȸ����������Ի�����
		FoodFactory foodFactory = new FoodFactory();
		//�ٸ���������ˮ������
		AbstractFactory abstractFactory = foodFactory.getFactory("fruit");
		//����������ƻ����
		Fruit apple = abstractFactory.getFruit("apple");
		System.out.println("���ӳ�" + apple.toString());
		//�����������㽶��
		Fruit banana = abstractFactory.getFruit("banana");
		System.out.println("���ӳ�" + banana.toString());
		
		//�ϰ�,��ƿ�����
		//�������ֹ���
		abstractFactory = foodFactory.getFactory("coke");
		Coke fenDa = abstractFactory.getCoke("fenDa");
		System.out.println("����ʹ��" + fenDa.toString());
		//������˼�ϴ���,������������~
		Coke meiNianDa = abstractFactory.getCoke("meiNianDa");
		System.out.println("����ʹ��" + meiNianDa.toString());
	}
}
