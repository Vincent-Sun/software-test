package cn.tjucic.st;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class TestTriangle1 {
	public Triangle2 tri;
	@Before
	public void setUp(){
		tri = new Triangle2();
	}
	@Test
	public void testa1() {
		assertEquals("判断是否能拿出X",true,tri.decide(41));
	}
	@Test
	public void testa2() {
		assertEquals("判断是否能拿出X",true,tri.decide(42));
	}
	@Test
	public void testa3() {
		assertEquals("判断是否能拿出X",true,tri.decide(40));
	}
	@Test
	public void testa4() {
		assertEquals("判断是否能拿出X",true,tri.decide(43));
	}
	@Test
	public void testa5() {
		assertEquals("判断是否能拿出X",true,tri.decide(36));
	}
	@Test
	public void testa6() {
		assertEquals("判断是否能拿出X",true,tri.decide(37));
	}
	@Test
	public void testa7() {
		assertEquals("判断是否能拿出X",true,tri.decide(59));
	}
	@Test
	public void testa8() {
		assertEquals("判断是否能拿出X",true,tri.decide(66));
	}
	@Test
	public void testa9() {
		assertEquals("判断是否能拿出X",true,tri.decide(85));
	}
	@Test
	public void testa10() {
		assertEquals("判断是否能拿出X",true,tri.decide(88));
	}
	@Test
	public void testXa11() {
		assertEquals("判断是否能拿出X",true,tri.decide(79));
	}
	@Test
	public void testXa12() {
		assertEquals("判断是否能拿出X",true,tri.decide(9));
	}


}
