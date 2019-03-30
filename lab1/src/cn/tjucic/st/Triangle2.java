package cn.tjucic.st;

public class Triangle2 {
	int gewei = 0;
	int shiwei = 0;
	public void divide(int n) {
		gewei = n % 10;
	    shiwei = n / 10 % 10;
	}
	public boolean decide(int n) {
		divide(n);
		 if(gewei == 0 || gewei == 1 || gewei == 2 || gewei == 3){
			    if(shiwei == 0 || shiwei == 1 || shiwei == 2 || shiwei == 3 || shiwei == 5 || shiwei == 7 || shiwei == 8 || shiwei == 6){
			        return true;
			    }
			    else {
			    	return false;
			    }
		 }
		else if(gewei == 5 || gewei == 6 || gewei == 7 || gewei == 8){
			    if(shiwei == 0 || shiwei == 2 || shiwei == 5 || shiwei == 7){
			        return true;
			    }
			    else {
			        return false;
			    }
		 }			    
	    else{
			    return false;
	     }			   
	}

}
