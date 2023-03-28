package ass2;
//LB Assignment-2 -- part 2
public class Pattern_1 {

	public static void main(String[] args) {
			
/*		
		//Pattern 1 
		for(int i=0 ; i<5 ; i++) {
			for(int j=0 ; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		//Pattern 2
		for(int i=1 ; i<=5 ; i++) {
			for(int j=5 ; j>0; j--) {
				if(j>i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
		
		//Pattern 3
		for(int i=0 ; i<=5 ; i++) {
			for(int j=0 ; j<=(5-i) ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		//Pattern 4
		for(int i=0 ; i<=5 ; i++) {
			for(int j=0 ; j<=5 ; j++) {
				if(j<i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}

		//Pattern 5
			for(int i=1 ; i<=5 ; i++) {
				for(int k=0 ; k<=5-i ; k++) {
					System.out.print(" ");
				}
				for(int j=1 ; j<=(2*i)-1 ; j++) {
						System.out.print("*");
				}
				System.out.println();
			}		
		
			//Pattern 6
			for(int i=0 ; i<=5 ; i++) {
				for(int k=1 ; k<=i ; k++) {
					System.out.print(" ");
				}
				for(int j=(2*(5-i))-1 ; j>=1 ; j--) {
						System.out.print("*");
				}
				System.out.println();
			}		

			//Pattern 7 (TYPE 1)
			for(int i=1 ; i<=5 ; i++) {
				for(int k=1 ; k<=5-i ; k++) {
					System.out.print(" ");
				}
				for(int j=1 ; j<=(2*i)-1 ; j++) {
						System.out.print("*");
				}
				System.out.println();
			}
			for(int i=1 ; i<=5 ; i++) {
				for(int k=1 ; k<=i ; k++) {
					System.out.print(" ");
				}
				for(int j=(2*(5-i))-1 ; j>=1 ; j--) {
						System.out.print("*");
				}
				System.out.println();
			}	

		//Pattern 8
		for(int i=0 ; i<6 ; i++) {
			for(int j=0 ; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1 ; i<6 ; i++) {
			for(int j=0 ; j<=5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		//Pattern 9 (TYPE 1)
		for(int i=0 ; i<6 ; i++) {
			for(int j=0 ; j<5-i; j++) {
				System.out.print(" ");
			}
			for(int j=0 ; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1 ; i<6 ; i++) {
			for(int j=0 ; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=0 ; j<=5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
					
			//Pattern 9 (TYPE 2)
			for(int i_= -5,i ; i_<= 5 ; i_++) {
				if(i_<0)
					i=-(i_);
				else
					i=i_;
				for(int j=0 ;j<i ;j++ ) {
					System.out.print(" ");
				}
				for(int k=5 ; k>=i ; k--) {
					System.out.print("*");
				}
				System.out.println();
			}

		//Pattern 7 (TYPE 2) Not Completed ..Try Again!
		

		//Pattern 10
		for(int i=0 ; i<6 ; i++) {
			for(int j=0 ; j<6-i; j++) {
				System.out.print(" ");
			}
			for(int j=0 ; j<6; j++) {
				System.out.print("*");
			}
			System.out.println();
		}	
		
		//Pattern 11
		for(int i=0 ; i<6 ; i++) {
			for(int j=0 ; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=0 ; j<6; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
					
		//Pattern 12
		for(int i=0 ; i<6 ; i++) {
			for(int j=0 ; j<=5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1 ; i<6 ; i++) {
			for(int j=0 ; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//Pattern 13
		for(int i=0 ; i<6 ; i++) {
			for(int j=0 ; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=0 ; j<6-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1 ; i<6 ; i++) {
			for(int j=0 ; j<5-i; j++) {
				System.out.print(" ");
			}
			for(int j=0 ; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}			

		//Pattern 14 ( 13 - > 14 jus add space!!)
		for(int i=0 ; i<6 ; i++) {
			for(int j=0 ; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=0 ; j<6-i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1 ; i<6 ; i++) {
			for(int j=0 ; j<5-i; j++) {
				System.out.print(" ");
			}
			for(int j=0 ; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}		

		//Pattern 15
		for(int i=1 ; i<=6 ; i++) {
			for(int j=0 ; j<i; j++) {
				if(i==6)
					System.out.print("*");
				else {
					if(j==0 || j==i-1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
		System.out.println();
		}		
			
		//Pattern 16
		for(int i=1 ; i<=6 ; i++) {
			for(int j=0 ; j<6-i ; j++) {
				System.out.print(" ");
			}
			for(int j=0 ; j<i; j++) {
				if(i==6)
					System.out.print("*");
				else {
					if(j==0 || j==i-1)
						System.out.print("*");
					else
						System.out.print(" ");
				}
			}
		System.out.println();
		}		
*/		
		
		//Pattern 14 ( 13 - > 14 jus add space!!)
				for(int i=0 ; i<6 ; i++) {
					for(int j=0 ; j<i; j++) {
						System.out.print(" ");
					}
					for(int j=0 ; j<6-i; j++) {
						System.out.print("* ");
					}
					System.out.println();
				}
				for(int i=1 ; i<6 ; i++) {
					for(int j=0 ; j<5-i; j++) {
						System.out.print(" ");
					}
					for(int j=0 ; j<=i; j++) {
						System.out.print("* ");
					}
					System.out.println();
				}	
	}//main

}//class
