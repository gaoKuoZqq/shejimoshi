package danlimoshi.test;

import org.junit.Test;

import danlimoshi.entity.Cup;
import danlimoshi.entity.Pen;

public class MyTest {
	@Test
	public void myTest() throws CloneNotSupportedException {
		//给老子来个杯子
		Cup cup1 = Cup.getCup();
		//MD不好用,在给老子来一个-.-
		Cup cup2 = Cup.getCup();
		//MD还是不好用,别TM是一个吧=.=
		if (cup2.equals(cup1)) {
			System.out.println("还真TM是一个!");
		}
		
		//给老子来杆笔
		Pen pen1 = Pen.getPen();
		//MD不好用,在给老子来一杆-.-
		Pen pen2 = Pen.getPen();
		//MD还是不好用,别TM是一杆吧=.=
		if (pen1.equals(pen2)) {
			System.out.println("还真TM是一杆!");
		}
		//真鸡儿晦气,爸爸克隆一杆行了吧
		Pen pen3 = pen2.clone();
		if (pen1 == pen3) {
			System.out.println("老子服了,就用这杆吧!");
		}else {
			System.out.println("老子真聪明,这点事难不倒我的!");
			
		}
	}
}
