package yuanxingmoshi.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import yuanxingmoshi.entity.Body;
import yuanxingmoshi.entity.Style;

/*
 * ֻ��עǳ��¡
 */
public class MyTest {

	//������Ϸ,һ���û�����ӵ�ж������(�������)������
	//�û��Ѿ����ò�����һ������--�ؼ���,������ǻ������ж���,���Կ��ǽ�����ģʽ
	//�û�ϣ�������������۾�����Ϊ˫��Ƥ,��������ΪС���Ȳ�Ϊ�˴���һ���µ�����
	//��Ϣ���û��˱���,�û�������ʱ������ԭ������
	@Test
	public void myTest() throws Exception {
		//��ȡ�û��ṩ��ԭ������
		Style style1 = userSend();
		//��ȡ�µ�����
		Style style2 = style1.clone();
		//�鿴���������Ƿ�Ϊһ��
		if (style1 == style2) {
			System.out.println("��������,δ�ܳɹ���¡����");
		}else if (style1.equals(style2)) {//��д��equals����
			System.out.println("�ɹ���¡����");
			style2.setEyes("˫��Ƥ");
			style2.getBody().setDescribe("С����");
		}
		//��������cookie
		List<Style> styles = new ArrayList<Style>();
		styles.add(style1);
		styles.add(style2);
		setCookies(styles);
	}
	
	public Style userSend() {
		return new Style("�쵰��", "����Ƥ", "�߱���", "�����", new Body("����"));
	}
	
	public void setCookies(List<Style> styles) {
		System.out.println("��cookie����Ϊ:" + styles);
		//ǳ��¡ģʽ,����Ϊ�¶��󴴽��µ�Ƕ�׶���
		if (styles.get(0).getEyes() == styles.get(1).getEyes()) {
			System.out.println("��,���԰�,����1���۾�Ҳ���޸���!");
		}
		if (styles.get(0).getBody() == styles.get(1).getBody()) {
			System.out.println("��,���԰�,����1������Ҳ���޸���!");
		}
	}
}
