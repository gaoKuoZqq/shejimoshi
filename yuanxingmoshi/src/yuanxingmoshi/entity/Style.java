package yuanxingmoshi.entity;

public class Style implements Cloneable{

	private String face;
	private String eyes;
	private String nose;
	private String mouth;
	private Body body;
	public String getFace() {
		return face;
	}
	public void setFace(String face) {
		this.face = face;
	}
	public String getEyes() {
		return eyes;
	}
	public void setEyes(String eyes) {
		this.eyes = eyes;
	}
	public String getNose() {
		return nose;
	}
	public void setNose(String nose) {
		this.nose = nose;
	}
	public String getMouth() {
		return mouth;
	}
	public void setMouth(String mouth) {
		this.mouth = mouth;
	}
	public Body getBody() {
		return body;
	}
	public void setBody(Body body) {
		this.body = body;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Style other = (Style) obj;
		if (body == null) {
			if (other.body != null)
				return false;
		} else if (!body.equals(other.body))
			return false;
		if (eyes == null) {
			if (other.eyes != null)
				return false;
		} else if (!eyes.equals(other.eyes))
			return false;
		if (face == null) {
			if (other.face != null)
				return false;
		} else if (!face.equals(other.face))
			return false;
		if (mouth == null) {
			if (other.mouth != null)
				return false;
		} else if (!mouth.equals(other.mouth))
			return false;
		if (nose == null) {
			if (other.nose != null)
				return false;
		} else if (!nose.equals(other.nose))
			return false;
		return true;
	}
	public Style(String face, String eyes, String nose, String mouth, Body body) {
		super();
		this.face = face;
		this.eyes = eyes;
		this.nose = nose;
		this.mouth = mouth;
		this.body = body;
	}
	public Style() {
		super();
	}
	
	public Style clone() throws CloneNotSupportedException {
		return (Style) super.clone();
	}
	@Override
	public String toString() {
		return "Style [face=" + face + ", eyes=" + eyes + ", nose=" + nose + ", mouth=" + mouth + ", body=" + body
				+ "]";
	}
	
}
