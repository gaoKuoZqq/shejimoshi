package danlimoshi.test;

import org.junit.Test;

import danlimoshi.entity.Cup;
import danlimoshi.entity.Pen;

public class MyTest {
	@Test
	public void myTest() throws CloneNotSupportedException {
		//��������������
		Cup cup1 = Cup.getCup();
		//MD������,�ڸ�������һ��-.-
		Cup cup2 = Cup.getCup();
		//MD���ǲ�����,��TM��һ����=.=
		if (cup2.equals(cup1)) {
			System.out.println("����TM��һ��!");
		}
		
		//���������˱�
		Pen pen1 = Pen.getPen();
		//MD������,�ڸ�������һ��-.-
		Pen pen2 = Pen.getPen();
		//MD���ǲ�����,��TM��һ�˰�=.=
		if (pen1.equals(pen2)) {
			System.out.println("����TM��һ��!");
		}
		//�漦������,�ְֿ�¡һ�����˰�
		Pen pen3 = pen2.clone();
		if (pen1 == pen3) {
			System.out.println("���ӷ���,������˰�!");
		}else {
			System.out.println("���������,������Ѳ����ҵ�!");
			
		}
	}
}
