package dailimoshi.entity;

public class IphoneX implements Phone{

	@Override
	public void call(String mobile) {
		System.out.println("ʹ��IphoneX����:" + mobile);
	}

	@Override
	public String game() {
		return "IphoneX֡��:60";
	}

}
