package dailimoshi.entity;

public class MiMax implements Phone{

	@Override
	public void call(String mobile) {
		System.out.println("ʹ��MiMax����:" + mobile);
	}

	@Override
	public String game() {
		return "MiMax֡��:40";
	}

}
