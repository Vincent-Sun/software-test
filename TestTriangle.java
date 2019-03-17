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
		assertEquals("判断是否能拿出X",true,tri.decide(83));
	}
	@Test
	public void test2() {
		assertEquals("判断是否能拿出X",true,tri.decide(1));
	}
	@Test
	public void test3() {
		assertEquals("判断是否能拿出X",false,tri.decide(99));
	}
}
