package cn.tjucic.st;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class TestTriangle {
	public Triangle tri;
	@Before
	public void setUp(){
		tri = new Triangle();
	}
	@Test
	public void test1() {
		assertEquals("�ж��Ƿ����ó�X",true,tri.decide(83));
	}
	@Test
	public void test2() {
		assertEquals("�ж��Ƿ����ó�X",true,tri.decide(1));
	}
	@Test
	public void test3() {
		assertEquals("�ж��Ƿ����ó�X",false,tri.decide(99));
	}
}
