package basic;

import java.util.Scanner;

//Check if the given number is EVEN or ODD. 

public class Prog_1 {

	public Prog_1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.println("Enter a number : \n");
		n=sc.nextInt();
		
		if(n%2 == 0)
			System.out.println("\n"+n+" is EVEN\n");
		else
			System.out.println("\n"+n+" is ODD\n");
		
		sc.close();
	}

}
