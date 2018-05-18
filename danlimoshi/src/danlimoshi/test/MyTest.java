package danlimoshi.test;

import org.junit.Test;

import danlimoshi.entity.Cup;
import danlimoshi.entity.Pen;

public class MyTest {
	@Test
	public void myTest() {
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
	}
}
