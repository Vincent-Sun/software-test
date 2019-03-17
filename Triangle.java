package cn.tjucic.st;

import java.util.ArrayList;
import java.util.List;

public class Triangle {
	List<Integer> list = new ArrayList<Integer>(){{add(50); add(20);add(5);add(5);add(1);add(1);add(1);}};
	boolean decide(int n) {
		for(int i = 0; i < list.size(); i++) {
			if(n == list.get(i)) {
				return true;
			}
			if(n > list.get(i)) {
				int temp = list.get(i);
				list.remove(i);
				return decide(n - temp);
			}
		}
		return false;
	}
	

}
