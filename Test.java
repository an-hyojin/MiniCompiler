
public class Test {
	static int[] q;
	
	public static void main(String[] args) {
		init(3) ;
		System.out.println(q[5]);
	}
	
	public static void init(int n) {
		q = new int[6];
		q[5] = n;
	}

}
