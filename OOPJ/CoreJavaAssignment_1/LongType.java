/*
 * 19.Write a program to perform below operations on long type to
get:
a. The number of bits used to represent a long value
b. The number of bytes used to represent a long value
c. The minimum value a long
d. The maximum value a long

20.Write a program to convert:
a. long value into String
b. long value into Long instance.
c. String instance into Long instance.
d. long value into binary, octal and hexadecimal string.

21.Write a program to convert state of Long instance into byte,
short, int, long, float and double.

22. Write a program to find minimum and maximum number as well as
to add two long numbers using methods of Long.
 */

package basic_q;

public class LongType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//19
		System.out.println("number of bits used to represent a Long value : "+Long.SIZE+" bits");
		System.out.println("number of bytes used to represent a Long value : "+Long.BYTES+" Byte");
		System.out.println("minimum value a Long : "+Long.MIN_VALUE);		
		System.out.println("maximum value a Long : "+Long.MAX_VALUE+"\n");
				
		//20
		//a
		long a = 6969696969l;
		String astr = String.valueOf(a);
		String _astr = Long.toString(a);
		System.out.println("Long value into String String.valueOf : "+astr+" Long.tString : "+_astr);
				
		//b
		long b = 6969696969l;
		Long ll = b;
		System.out.println("Long value into Long instance : "+ll.toString());
				
		//c
		String cstr = new String("6969696969");
		Long lc = Long.parseLong(cstr);
		System.out.println("String instance into Long instance : "+lc.toString());
				
		//d : int value into binary, octal and hexadecimal string.
		long d= 6969696969l;
		String strBi = Long.toBinaryString(d), strOc = Long.toOctalString(d), strHex = Long.toHexString(d);
		System.out.println(" binary int : "+strBi+" Octal int : "+strOc+" Hex int : "+strHex+"\n");
				
				
		//21.convert state of Integer instance
		Long lConvert = 6969696969l;
		byte by = lConvert.byteValue(); 
		short bs = lConvert.shortValue();
		int bi = lConvert.intValue();
		float bf = lConvert.floatValue();
		double bd = lConvert.doubleValue();
		System.out.println("state of Byte instance into byte : "+by+ "\nshort : "+bs+ "\nint : "+bi
								+"\nfloat : "+bf+ "\ndouble : "+bd+"\n");		
				
		//22
		long asum = 10000000l , bsum = 20000000l;
		long sum = Long.sum(asum,bsum);
		System.out.println("Long.sum(a,b) : "+sum);
	}

}
