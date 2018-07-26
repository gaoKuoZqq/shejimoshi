package dailimoshi.entity;

public class IphoneX implements Phone{

	@Override
	public void call(String mobile) {
		System.out.println("Ê¹ÓÃIphoneX²¦ºÅ:" + mobile);
	}

	@Override
	public String game() {
		return "IphoneXÖ¡ÂÊ:60";
	}

}
