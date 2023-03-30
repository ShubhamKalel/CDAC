/**
 10.Write a program to perform below operations on char type to
get:
a. The number of bits used to represent a char value
b. The number of bytes used to represent a char value
c. The minimum value a char
d. The maximum value a char

 */

package basic_q;

public class CharType {

	public static void main(String[] args) {
		//10
		System.out.println("number of bits used to represent a Char value : "+Character.SIZE+" bits");
		System.out.println("number of bytes used to represent a Char value : "+Character.BYTES+" Byte");		
		System.out.println("minimum value a Char : "+(int)Character.MIN_VALUE);				
		System.out.println("maximum value a Char : "+(int)Character.MAX_VALUE+"\n");
		

		
	}

}
