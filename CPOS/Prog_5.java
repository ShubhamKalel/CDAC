//whether a given number is Leap year or NOT
package Agmt_1;

public class Prog_5 {

	public static void main(String[] args) {
		int year = 1944;
		if(year % 4 == 0 || year == 0)
			System.out.println("leap");
		else
			System.out.println("NOT leap");
	}

}
