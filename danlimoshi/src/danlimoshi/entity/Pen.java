package danlimoshi.entity;

/**
 * ����ʽ
 */
public class Pen {
	private static Pen pen = new Pen();
	////����ģʽ�벻�����췽��˽��
	private Pen() {}
	
	public static Pen getPen(){
		return pen;
	}
}
