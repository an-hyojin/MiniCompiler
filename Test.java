public class Hello {
	static int a =1;
	static int b;
	static int[] c;
	
	public static void Arrinit(int n) {
		c = new int[5];
		c[0] = a;
		System.out.println(c[0]);
		c[1] = n;
		System.out.println(c[1]);
		c[2] = 3;
		System.out.println(c[2]);
		b= 4;
		c[3] = b;
		System.out.println(c[3]);
		++b;
		c[4] =b;
		System.out.println(c[4]);
		
	}
	public static void main(String[] args) {
		Arrinit(2) ;
		add(c[0], c[1]) ;
		while(b>0) {
			System.out.println(b);
			--b;
		}
	}
	
	public static int add(int temp1, int temp2) {
		System.out.println(temp1+temp2);
		return temp1+temp2;
	}
	
}
