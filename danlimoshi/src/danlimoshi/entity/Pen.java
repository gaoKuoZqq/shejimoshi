package danlimoshi.entity;

/**
 * ����ʽ
 */
public class Pen implements Cloneable{
	private static Pen pen = new Pen();
	////����ģʽ�벻�����췽��˽��
	private Pen() {}
	
	public static Pen getPen(){
		return pen;
	}
	
	public Pen clone() throws CloneNotSupportedException {
		return (Pen) super.clone();
	}
}
