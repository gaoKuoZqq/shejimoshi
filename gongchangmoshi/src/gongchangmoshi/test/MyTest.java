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

	//以前,想吃水果直接要
	@Test
	public void myTestOld() {
		//传统模式
		//给老子来个苹果吃
		Apple apple = new Apple();
		System.out.println("老子吃" + apple.toString());
		//给老子来个香蕉吃
		Banana banana = new Banana();
		System.out.println("老子吃" + banana.toString());
	}
	
	//现在,想吃水果去找工厂要
	@Test
	public void myTestNow() {
		//工厂模式
		//先给老子来个水果工厂
		FruitFactory fruitFactory = new FruitFactory();
		//给老子来个苹果吃
		Fruit apple = fruitFactory.getFruit("apple");
		System.out.println("老子吃" + apple.toString());
		//给老子来个香蕉吃
		Fruit banana = fruitFactory.getFruit("banana");
		System.out.println("老子吃" + banana.toString());
	}
	
	//以后,不一定想吃水果了,生活水准在上升,没准要喝可乐
	@Test
	public void myTestuture() {
		//抽象工厂模式
		//先给老子来个吃货工厂
		FoodFactory foodFactory = new FoodFactory();
		//再给老子来个水果工厂
		AbstractFactory abstractFactory = foodFactory.getFactory("fruit");
		//给老子来个苹果吃
		Fruit apple = abstractFactory.getFruit("apple");
		System.out.println("老子吃" + apple.toString());
		//给老子来个香蕉吃
		Fruit banana = abstractFactory.getFruit("banana");
		System.out.println("老子吃" + banana.toString());
		
		//老板,来瓶美年达
		//来个可乐工厂
		abstractFactory = foodFactory.getFactory("coke");
		Coke fenDa = abstractFactory.getCoke("fenDa");
		System.out.println("老子痛饮" + fenDa.toString());
		//不好意思上错了,这是你的美年达~
		Coke meiNianDa = abstractFactory.getCoke("meiNianDa");
		System.out.println("老子痛饮" + meiNianDa.toString());
	}
}
