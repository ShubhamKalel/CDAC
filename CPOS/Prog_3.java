package basic;

//Swap two numbers without using the third variable approach

public class Prog_3 {

	public Prog_3() {
		// TODO Auto-generated constructor stub
	}
	public static void swap(int[] a,int[] b) {
		int temp=a[0];
		a[0]=b[0];
		b[0]=temp;	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {2}, b= {3};
		System.out.println(a[0]+" "+b[0]+"\n");
		
		swap(a,b);
		System.out.println(a[0]+" "+b[0]+"\n");
		
	}
}
