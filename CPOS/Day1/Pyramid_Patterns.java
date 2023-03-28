package ass2;

public class Pyramid_Patterns {

	public static void main(String[] args) {
/*
	//Pattern 1 
	for(int i=1 ; i< 10 ; i++) {
		for(int j=0 ; j<10-i ; j++) {
			System.out.print(" ");
		}
		for(int k=1; k<=i ;k++ ) {
			System.out.print(i+" ");
		}
		System.out.println("");
	}

	//Pattern 2 
		for(int i=1 ; i< 10 ; i++) {
			for(int j=0 ; j<10-i ; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i ;k++ ) {
				System.out.print(k+" ");
			}
			System.out.println("");
		}

		//Pattern 3	 
		for(int i=1 ; i< 10 ; i++) {
			for(int j=0 ; j<10-i ; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i ;k++ ) {
				System.out.print("* ");
			}
			System.out.println("");
		}

		//Pattern 4	 
		for(int i=1 ; i< 10 ; i++) {
			for(int k=1 ; k<2*(10-i) ; k++) {
				System.out.print(" ");
			}
			for(int j=1 ; j<=i ; j++) {
				System.out.print(j+" ");
			}
			for(int j=i-1 ; j>=1 ; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		//Pattern 5	 
		for(int i=9 ; i> 0 ; i--) {
			for(int j=1 ; j<(2*i)-1 ; j++ ) {
				System.out.print(" ");
			}
			for(int j=i ; j<=9 ; j++) {
				System.out.print(j+" ");
			}
			for(int j=8 ; j>=i ; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
				
		//Pattern 6	 - Invert Pyramid *
		for(int i=1 ; i< 10 ; i++) {
			for(int j=0 ; j<i ; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=10-i ;k++ ) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		//Pattern 7	 - Invert Pyramid numbers 
		for(int i=1 ; i< 10 ; i++) {
			for(int j=0 ; j<i ; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=10-i ;k++ ) {
				System.out.print(10-i+" ");
			}
			System.out.println("");
		}
		
*/
// *******	**************	**************	**************		
	
/*
		//Pattern - Half Pyramid (*)
			for(int i=1 ; i<=6 ; i++) {
				for(int j=1 ; j<=i ; j++) {
					System.out.print("*");
				}
				System.out.println();
			}		
  		
		//Pattern -Inverted Half Pyramid (*)
		for(int i=1 ; i<=6 ; i++) {
			for(int j=6 ; j>=i ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Pattern -Hollow Inverted Half Pyramid (*)
		for(int i=1 ; i<=6 ; i++) {
			for(int j=6 ; j>=i ; j--) {
				if(i==1) {
					System.out.print("*");
				}else {
					if(j==6 || j==i )
						System.out.print("*");
					else
						System.out.print(" ");					
				}
			}
			System.out.println();
		}
		
		//	Pattern - full Pyramid (*)
		for(int i=1 ; i<=6 ; i++) {
			for(int j=6 ; j>i ; j--) {
				System.out.print(" ");
			}
			for(int j=1 ; j<=2*i-1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}		
		
//		Pattern - full Pyramid (*)
			for(int i=1 ; i<=6 ; i++) {
				for(int j=1 ; j<i ; j++) {
					System.out.print(" ");
				}
				for(int j=1 ; j<=2*(6-i)-1 ; j++) {
					System.out.print("*");
				}
				System.out.println();
			}		
*/

		//	Pattern - Hollow full Pyramid (*)
		for(int i=1 ; i<=6 ; i++) {
			for(int j=6 ; j>i ; j--) {
				System.out.print(" ");
			}
			for(int j=1 ; j<=2*i-1 ; j++) {
				if(i==6) {
					System.out.print("*");
				}else {
					if(j==1 || j==2*i-1) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}	
				}
			}
			System.out.println();
		}
	}
}
