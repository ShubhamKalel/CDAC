/**
 * 33. Pass integer, float and double value from command line. Parse it appropriately and perform arithmetic operations (+,-,*,/)
on it. Here you can you switch case.
*/
import java.util.*;
class cmdSwitch{
	static int choice=-1;
	public static void main(String[] args) { // Pass integer, float and double value in mentioned order!
		Scanner scan = new Scanner(System.in);
		
		int ia= Integer.parseInt(args[0]);
		float fa= Float.parseFloat(args[1]);
		double da= Double.parseDouble(args[2]);
		//System.out.println(" int : "+args[0]+" float : "+args[1]+" Double : "+args[2]);
			
		
		while(choice!=0){
		System.out.println("Enter your choice : \n1. Add \n2. Substract \n3. Multiply \n4.Division \n0.Exit: ");
		choice = scan.nextInt();	
		
		switch(choice){// {1..2..3..4}
			case 1 :	//Add
				float sumif = ia + fa ;
				double sumid = ia + da ;
				double sumfd = da + fa ;
				System.out.println(ia+" + "+fa+" = "+sumif);
				System.out.println(ia+" + "+da+" = "+sumid);
				System.out.println(da+" + "+fa+" = "+sumfd);
		//		break;
				
			case 2 ://Sub
				float subif = fa - ia ;
				double subid = da - ia ;
				double subfd = da - fa ;
				System.out.println(fa+" - "+ia+" = "+subif);
				System.out.println(da+" - "+ia+" = "+subid);
				System.out.println(da+" - "+fa+" = "+subfd);
				
		//	break;
			case 3 ://Mul
				float mulif = ia * fa ;
				double mulid = ia * da ;
				double mulfd = da * fa ;
				System.out.println(ia+" * "+fa+" = "+mulif);
				System.out.println(ia+" * "+da+" = "+mulid);
				System.out.println(da+" * "+fa+" = "+mulfd);
				
		//		break;
			case 4 ://Div
				float divif = ia / fa ;
				double divid = ia / da ;
				double divfd = da / fa ;
				System.out.println(ia+" / "+fa+" = "+divif);
				System.out.println(ia+" / "+da+" = "+divid);
				System.out.println(da+" / "+fa+" = "+divfd);
				
				break;
			default : 
				System.out.println(" Wrong Choice Entered !");
				break;
			}//	
		}//while
		scan.close();
		
	}
}