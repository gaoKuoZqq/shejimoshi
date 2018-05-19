package danlimoshi.entity;

/**
 * 饿汉式
 */
public class Pen implements Cloneable{
	private static Pen pen = new Pen();
	////单例模式离不开构造方法私有
	private Pen() {}
	
	public static Pen getPen(){
		return pen;
	}
	
	public Pen clone() throws CloneNotSupportedException {
		return (Pen) super.clone();
	}
}
