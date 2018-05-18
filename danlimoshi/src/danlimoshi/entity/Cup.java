package danlimoshi.entity;

/**
 * 懒汉式
 */
public class Cup {
	private static Cup cup;
	//单例模式离不开构造方法私有
	private Cup() {
	}
	
	//不加锁可能出现多个杯子,不环保
	public synchronized static Cup getCup(){
		if (cup == null) {
			cup = new Cup();
		}
		return cup;
	}
	
	public String toString() {
		return "垃圾杯子";
	}
}
