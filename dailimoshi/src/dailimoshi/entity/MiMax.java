package dailimoshi.entity;

public class MiMax implements Phone{

	@Override
	public void call(String mobile) {
		System.out.println("Ê¹ÓÃMiMax²¦ºÅ:" + mobile);
	}

	@Override
	public String game() {
		return "MiMaxÖ¡ÂÊ:40";
	}

}
