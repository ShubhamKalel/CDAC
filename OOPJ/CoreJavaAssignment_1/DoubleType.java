/*
 * 27.Write a program to perform below operations on Double type to
get:
a. The number of bits used to represent a double value
b. The number of bytes used to represent a double value
c. The minimum value a double
d. The maximum value a double

28.Write a program to convert:
a. double value into String
b. double value into Double instance.
c. String instance into Double instance.
d. double value into binary, octal and hexadecimal
string(Note: Here you can use doubleToLongBits() method
along with methods of Long class).

29.Write a program to convert state of Double instance into byte,
short, int, long, float and double.

30.Write a program to find minimum and maximum number as well as
to add two double numbers using methods of Double.
 */

package basic_q;

public class DoubleType {

	public static void main(String[] args) {
		// 27
		System.out.println("number of bits used to represent a double value : "+Double.SIZE+" bits");
		System.out.println("number of bytes used to represent a double value : "+Double.BYTES+" Byte");
		
		System.out.println("minimum value a Double : "+Double.MIN_VALUE);
		
		System.out.println("maximum value a Double : "+Double.MAX_VALUE+"\n");

		//28
		//a
		double da = 69.69;
		String astr = Double.toString(da);
		String _astr = String.valueOf(da);
		System.out.println("double value into String Double.toString : "+astr+" String.valueOf : "+_astr);
		
		//b
		double db = 79.69;
		Double ddd = db;
		System.out.println("double value into Double instance : "+ddd.toString());
		
		//c
		String cstr = new String("69.7969");
		Double dinst = Double.parseDouble(cstr);
		System.out.println("String instance into Double instance : "+dinst.toString());
		
		//d
		
		// MORE CODE TO ADD !! => doubletolongbits() meth
		
		double dd = 696.969;
		String strHex = Double.toHexString(dd);
		System.out.println(" Hex Double: "+strHex+"\n");
		
		//29 convert state of Integer instance
		Double dConvert = 99995.6969;
		byte by = dConvert.byteValue(); 
		short bs = dConvert.shortValue();
		int bi = dConvert.intValue();
		long bl = dConvert.longValue();
		float bf = dConvert.floatValue();
		System.out.println("state of Double instance into byte : "+by+ "\nshort : "+bs+ "\nint : "+bi
						+ "\nlong : "+bl+ "\nfloat : "+bf+"\n");
		
		
		//30
		double ds1 = 69.69 , ds2 = 96.96 ;
		double sum = Double.sum(ds1, ds2);
		System.out.println("  add two double numbers : "+sum);
		
	}

}
