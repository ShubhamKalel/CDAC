package Agmt_1;

import java.util.Scanner;

//Write a Java Program to find the Factorial of a given number. 
public class Prog_2 {

	public Prog_2() {
		// TODO Auto-generated constructor stub
	}
	
	public static int fact(int f) {
		
		if(f == 0 || f == 1)
			return 1;
		else
			f=f*fact(f-1);
		
		return f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number to find Factorial : \n");
		int n=sc.nextInt();
		
		System.out.println(fact(n));
		
		sc.close();
	}

}
