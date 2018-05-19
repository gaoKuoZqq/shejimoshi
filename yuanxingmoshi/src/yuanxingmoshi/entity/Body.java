package yuanxingmoshi.entity;

public class Body {

	private String describe;

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public Body(String describe) {
		super();
		this.describe = describe;
	}

	public Body() {
		super();
	}

	@Override
	public String toString() {
		return "Body [describe=" + describe + "]";
	}
	
	
}
