/**
 15. Write a program to perform below operations on int type to
get:
a. The number of bits used to represent a integer value
b. The number of bytes used to represent a integer value
c. The minimum value a integer
d. The maximum value a integer

16. Write a program to convert:
a. int value into String
b. int value into Integer instance.
c. String instance into Integer instance.
d. int value into binary, octal and hexadecimal string.

17. Write a program to convert state of Integer instance into
byte, short, int, long, float and double.

18. Write a program to find minimum and maximum number as well as
to add two integer numbers using methods of Integer.
 */

package basic_q;

public class IntType {

	public static void main(String[] args) {
		//15
		System.out.println("number of bits used to represent a integer value : "+Integer.SIZE+" bits");
		System.out.println("number of bytes used to represent a integer value : "+Integer.BYTES+" Byte");
		
		System.out.println("minimum value a Integer : "+Integer.MIN_VALUE);
		
		System.out.println("maximum value a Integer : "+Integer.MAX_VALUE+"\n");
		
		//16
		//a
		int a = 696;
		String astr = String.valueOf(a);
		String _astr = Integer.toString(a);
		System.out.println("int value into String String.valueOf : "+astr+" Integer.tString : "+_astr);
		
		//b
		int b = 6969;
		Integer ii = b;
		System.out.println("int value into Integer instance : "+ii.toString());
		
		//c
		String cstr = new String("9696");
		Integer ic = Integer.parseInt(cstr);
		System.out.println("String instance into Integer instance : "+ic.toString());
		
		//d : int value into binary, octal and hexadecimal string.
		int d= 14369;
		String strBi = Integer.toBinaryString(d), strOc = Integer.toOctalString(d), strHex = Integer.toHexString(d);
		System.out.println(" binary int : "+strBi+" Octal int : "+strOc+" Hex int : "+strHex+"\n");
		
		
		//convert state of Integer instance
		Integer iConvert = 99995;
		byte by = iConvert.byteValue(); 
		short bs = iConvert.shortValue();
		int bi = iConvert.intValue();
		long bl = iConvert.longValue();
		float bf = iConvert.floatValue();
		double bd = iConvert.doubleValue();
		System.out.println("state of Byte instance into byte : "+by+ "\nshort : "+bs+ "\nint : "+bi
						+ "\nlong : "+bl+ "\nfloat : "+bf+ "\ndouble : "+bd+"\n");		
		
		//18
		System.out.println("minimum Int value : "+Integer.MIN_VALUE);
		System.out.println("maximum Int value : "+Integer.MAX_VALUE);
		int asum = 10 , bsum = 20 ;
		int sum = Integer.sum(asum,bsum);
		System.out.println("Integer.sum(a,b) : "+sum);
		

	}

}
