package danlimoshi.entity;

/**
 * 饿汉式
 */
public class Pen {
	private static Pen pen = new Pen();
	////单例模式离不开构造方法私有
	private Pen() {}
	
	public static Pen getPen(){
		return pen;
	}
}
