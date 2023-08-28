package ch05reference;

public class C05array {
	public static void main(String[] args) {
		int[] a = {3, 4, 5};
		int[] b = a;
		
		System.out.println(b[2]); // 5
		
		a[2] = 7;
		
		System.out.println(b[2]); // 7
		
		int[] c = {10, 20, 30};
		int[] d = {10, 20, 30};
		
		System.out.println(d[2]); // 30
		
		c[2] = 90;
		
		System.out.println(c[2]); // 90
		System.out.println(d[2]); // 30? 90?
		
	}
}





