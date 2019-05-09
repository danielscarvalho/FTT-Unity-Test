package ftt.ec.beans;

public class Calc {
	
    //somar números positivos, se < 0 mudar para 0
	public int add(int a, int b) {
		return a + b;
	}
	//somar números positivos, se < 0 mudar para 0
	public float add(float a, float b) {
		return a + b;
	}
	
	public boolean prime(int n) {
		//Reference: https://www.mkyong.com/java/how-to-determine-a-prime-number-in-java/
		//check if n is a multiple of 2
	    if (n%2==0) return false;
	    //if not, then just check the odds
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}

}
