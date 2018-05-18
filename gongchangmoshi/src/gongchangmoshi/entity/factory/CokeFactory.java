package gongchangmoshi.entity.factory;

import gongchangmoshi.entity.coke.Coke;
import gongchangmoshi.entity.coke.FenDa;
import gongchangmoshi.entity.coke.MeiNianDa;
import gongchangmoshi.entity.fuiture.Fruit;

public class CokeFactory extends AbstractFactory{
	public Coke getCoke(String type) {
		Coke fruit = null;
		switch (type) {
		case "meiNianDa":
			fruit = new MeiNianDa();
			break;
		case "fenDa":
			fruit = new FenDa();
			break;
		}
		return fruit;
	}

	@Override
	public Fruit getFruit(String type) {
		// TODO Auto-generated method stub
		return null;
	}
}
