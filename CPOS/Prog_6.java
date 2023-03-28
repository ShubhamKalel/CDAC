//print the digits of a Given Number
package Agmt_1;

public class Prog_6 {

	public static void main(String[] args) {
		long n = 8383060565l;
		
		while(n>0) {
			System.out.println(n%10);
			n=n/10;
		}	
	}
}
