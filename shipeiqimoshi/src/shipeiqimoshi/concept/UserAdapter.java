package shipeiqimoshi.concept;

/**
 * 适配器类,需实现原有接口,保证原始功能不变
 * 持有新接口,可以使用新功能
 */
public class UserAdapter implements UserService{

	private UserJsonService userJsonService;
	
	@Override
	public String saveUser(User user) {
		return "成功保存信息";
	}
	
	public String saveUser(String user) {
		return userJsonService.saveUser(user);
	}

	public UserAdapter(UserJsonService userJsonService) {
		super();
		this.userJsonService = userJsonService;
	}
}
