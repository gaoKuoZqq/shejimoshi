package yuanxingmoshi.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import yuanxingmoshi.entity.Body;
import yuanxingmoshi.entity.Style;

/*
 * 只关注浅克隆
 */
public class MyTest {

	//捏脸游戏,一个用户可以拥有多个复杂(花里胡哨)的造型
	//用户已经设置并保存一个类型--关键点,如果不是基于已有对象,可以考虑建造者模式
	//用户希望将已有造型眼睛设置为双眼皮,身体设置为小短腿并为此创建一个新的造型
	//信息在用户端保存,用户在请求时发来了原有造型
	@Test
	public void myTest() throws Exception {
		//获取用户提供的原有造型
		Style style1 = userSend();
		//获取新的造型
		Style style2 = style1.clone();
		//查看两个造型是否为一个
		if (style1 == style2) {
			System.out.println("出问题了,未能成功克隆造型");
		}else if (style1.equals(style2)) {//重写了equals方法
			System.out.println("成功克隆造型");
			style2.setEyes("双眼皮");
			style2.getBody().setDescribe("小短腿");
		}
		//更新造型cookie
		List<Style> styles = new ArrayList<Style>();
		styles.add(style1);
		styles.add(style2);
		setCookies(styles);
	}
	
	public Style userSend() {
		return new Style("鹅蛋脸", "单眼皮", "高鼻梁", "大嘴巴", new Body("大长腿"));
	}
	
	public void setCookies(List<Style> styles) {
		System.out.println("将cookie设置为:" + styles);
		//浅克隆模式,不会为新对象创建新的嵌套对象
		if (styles.get(0).getEyes() == styles.get(1).getEyes()) {
			System.out.println("咦,不对啊,造型1的眼睛也被修改了!");
		}
		if (styles.get(0).getBody() == styles.get(1).getBody()) {
			System.out.println("咦,不对啊,造型1的身体也被修改了!");
		}
	}
}
