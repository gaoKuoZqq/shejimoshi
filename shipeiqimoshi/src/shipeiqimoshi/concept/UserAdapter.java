package shipeiqimoshi.concept;

/**
 * ��������,��ʵ��ԭ�нӿ�,��֤ԭʼ���ܲ���
 * �����½ӿ�,����ʹ���¹���
 */
public class UserAdapter implements UserService{

	private UserJsonService userJsonService;
	
	@Override
	public String saveUser(User user) {
		return "�ɹ�������Ϣ";
	}
	
	public String saveUser(String user) {
		return userJsonService.saveUser(user);
	}

	public UserAdapter(UserJsonService userJsonService) {
		super();
		this.userJsonService = userJsonService;
	}
}
