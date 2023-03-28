//find the sum of the digits of a given number.
package Agmt_1;

public class Prog_8 {

	public static void main(String[] args) {
		int n = 465647,sum=0;
		while(n>0) {
			sum=sum+(n%10);
			n=n/10;
		}
		System.out.println(sum);
	}

}
