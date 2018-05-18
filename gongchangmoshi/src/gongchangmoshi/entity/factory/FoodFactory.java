package gongchangmoshi.entity.factory;

public class FoodFactory {
	public AbstractFactory getFactory(String type) {
		AbstractFactory abstractFactory = null;
		switch (type) {
		case "fruit":
			abstractFactory = new FruitFactory();
			break;
		case "coke":
			abstractFactory = new CokeFactory();
			break;
		}
		return abstractFactory;
	}
}
