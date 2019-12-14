
public class Test {
	static int q;
	
	
	public static void main(String[] args) {
		
		int[] a = new int[4];
		int b = 3;
		q =5;
		if(q==5) {
			System.out.println(1);
		}else {
			System.out.println(2);
		}
		while(b>0) {
			a[b] = b;
			System.out.println(a[b]);
			--b;
		}
		return;
	}

}
