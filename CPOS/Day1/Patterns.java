package ass2;

public class Patterns {

	public static void main(String[] args) {
		
		/*
		  		
		//pattern 1 
		for(int i=1 ; i<=5 ; i++) {
			for(int j=1 ; j<=5 ; j++) {
				if(j<=i)
					System.out.print(j+" ");
			}
			System.out.println();
		}
		
		//pattern 2 
		for(char i='A' ; i<='E' ; i++) {
			for(char j='A' ; j<='E' ; j++) {
				if(j<=i)
					System.out.print(j+" ");
			}
			System.out.println();
		}
		
		//pattern 3	
		for(char i=1 ; i<=5 ; i++) {
			for(char j=1 ; j<=5 ; j++) {
				if(j<=i)
					System.out.print("* ");
			}
			System.out.println();
		}
		
		//pattern 4 
		for(int i=1 ; i<=5 ; i++) {
			for(int j=1 ; j<=5 ; j++) {
				if(j<=i)
					System.out.print(i+" ");
			}
			System.out.println();
		}
		
		//pattern 5 
		for(char i='A' ; i<='E' ; i++) {
			for(char j='A' ; j<='E' ; j++) {
				if(j<=i)
					System.out.print(i+" ");
			}
			System.out.println();
		}
				
		//pattern 6 
		for(int i=1 ; i<=5 ; i++) {
			for(int j=5 ; j>=1 ; j--) {
				if(j<=i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

		//pattern 7 
		for(int i=1 ; i<=5 ; i++) {
			for(int k=1 ; k<=5-i ; k++) {
				System.out.print(" ");
			}
			int p=1;
			for(int j=1 ; j<=i ; j++) {
				System.out.print(p+" ");
				p++;
			}
			System.out.println();
		}				

		//pattern 8
		for(int i=1 ; i<=5 ; i++) {
			for(int k=1 ; k<=5-i ; k++) {
				System.out.print(" ");
			}
			int p=5-(i-1);
			for(int j=1 ; j<=i ; j++) {
				System.out.print(p+" ");
				p++;
			}
			System.out.println();
		}
			
		//pattern 9
		for(int i=1 ; i<=5 ; i++) {
			for(int k=1 ; k<=5-i ; k++) {
				System.out.print(" ");
			}
			char p='A';
			for(int j=1 ; j<=i ; j++) {
				System.out.print(p+" ");
				p++;
			}
			System.out.println();
		}			
		
		//pattern 10
		for(int i=1 ; i<=5 ; i++) {
			for(int k=1 ; k<=5-i ; k++) {
				System.out.print(" ");
			}
			char p=(char)(70-(i-0));
			for(int j=1 ; j<=i ; j++) {
				System.out.print(p+" ");
				p++;
			}
			System.out.println();
		}

		//pattern 11
		for(int i=1 ; i<=5 ; i++) {
			for(int k=1 ; k<=5-i ; k++) {
				System.out.print(" ");
			}
			for(int j=1 ; j<=(2*i)-1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//pattern 12
		for(int i=1 ; i<=5 ; i++) {
			for(int k=1 ; k<=5-i ; k++) {
				System.out.print(" ");
			}
			for(int j=1 ; j<=i ; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}	
		
		//pattern 12
		for(int i=1 ; i<=5 ; i++) {
			for(int k=1 ; k<=5-i ; k++) {
				System.out.print(" ");
			}
			char p = (char)(64+i);
			for(int j=1 ; j<=i ; j++) {
				System.out.print(p+" ");
			}
			System.out.println();
		}
		
		//pattern 13
		for(int i=1 ; i<=5 ; i++) {
			for(int k=1 ; k<=5-i ; k++) {
				System.out.print(" ");
			}
			char p = (char)(64+i);
			for(int j=1 ; j<=i ; j++) {
				System.out.print(p+" ");
			}
			System.out.println();
		}
		
		//pattern 14
		for(int i=5 ; i>=1 ; i--) {
			for(int j=1 ; j<=i ; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		//pattern 15
		for(int i=1 ; i<=5 ; i++) {
			for(int j=5 ; j>= 1+(i-1) ; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		//pattern 16
		for(int i=5 ; i>=1 ; i--) {
			for(int j=5 ; j>= i ; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

		//pattern 17
		int p=1;
		for(int i=1 ; i<=5 ; i++	) {
			for(int j=1 ; j<= i ; j++) {
				System.out.print(p+" ");
				p++;
			}
			System.out.println();
		}	
		
		*/
		
		//pattern 18
		for(int i=1 ; i<=5 ; i++) {
			char p='A';
			for(int j=1 ; j<=5-(i-1) ; j++) {
				System.out.print(p+" ");
				p++;
			}
			System.out.println();
		}														
		
		
		
	}
}
