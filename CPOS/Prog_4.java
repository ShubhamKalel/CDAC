package Agmt_1;
//How to check whether the given number is Positive or Negative in Java? 

import java.util.Scanner;

public class Prog_4 {

	public Prog_4() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number to Check if its positive or negative : \n");
		int n=sc.nextInt();
		
		if(n>0) {
			System.out.println("+ve\n");
		}else if(n<0){
			System.out.println("-ve\n");			
		}else
			System.out.println("0\n");
		
		sc.close();
		
	}

}
