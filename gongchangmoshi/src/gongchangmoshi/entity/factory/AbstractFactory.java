package gongchangmoshi.entity.factory;

import gongchangmoshi.entity.coke.Coke;
import gongchangmoshi.entity.fuiture.Fruit;

/**
 * ³éÏó¹¤³§
 */
public abstract class AbstractFactory {
	public abstract Coke getCoke(String type);
	public abstract Fruit getFruit(String type);
}
