
public class Test {
	static int[] q;
	static int a =10;
	public static void main(String[] args) {
		init(3) ;
		System.out.println(q[5]);
		System.out.println(a);
	}
	
	public static void init(int n) {
		System.out.println(a);
		++a;
		System.out.println(a);
		q = new int[6];
		q[5] = n;
	}

}
