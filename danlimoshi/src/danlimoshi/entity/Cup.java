package danlimoshi.entity;

/**
 * ����ʽ
 */
public class Cup {
	private static Cup cup;
	//����ģʽ�벻�����췽��˽��
	private Cup() {
	}
	
	//���������ܳ��ֶ������,������
	public synchronized static Cup getCup(){
		if (cup == null) {
			cup = new Cup();
		}
		return cup;
	}
	
	public String toString() {
		return "��������";
	}
}
