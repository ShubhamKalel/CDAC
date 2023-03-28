//print all the Factors of the Given number.
package Agmt_1;

public class Prog_7 {

	public static void main(String[] args) {
		int n = 373;
		
		for(int i=1 ; i < n/2 ; i++ ) {
			if(n%i==0)
				System.out.println(i);
		}
		System.out.println(n);
	}
}
