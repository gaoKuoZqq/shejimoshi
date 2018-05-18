package gongchangmoshi.entity.factory;

import gongchangmoshi.entity.coke.Coke;
import gongchangmoshi.entity.fuiture.Apple;
import gongchangmoshi.entity.fuiture.Banana;
import gongchangmoshi.entity.fuiture.Fruit;

public class FruitFactory extends AbstractFactory{
	public Fruit getFruit(String type) {
		Fruit fruit = null;
		switch (type) {
		case "apple":
			fruit = new Apple();
			break;
		case "banana":
			fruit = new Banana();
			break;
		}
		return fruit;
	}

	@Override
	public Coke getCoke(String type) {
		// TODO Auto-generated method stub
		return null;
	}
}
