package dailimoshi.entity;

public class PhoneProxy implements Phone{

	private Phone phone;
	@Override
	public void call(String mobile) {
		phone.call("+186 " + mobile);
	}
	public PhoneProxy(Phone phone) {
		super();
		this.phone = phone;
	}
	public PhoneProxy() {
		super();
	}
	@Override
	public String game() {
		System.out.println("ÕıÔÚ²âÊÔÖ¡ÂÊ");
		return phone.game();
	}
	
	
	
}
