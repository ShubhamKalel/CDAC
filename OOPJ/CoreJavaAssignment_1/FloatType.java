/*
 * 23.Write a program to perform below operations on float type to
get:
a. The number of bits used to represent a float value
b. The number of bytes used to represent a float value
c. The minimum value a float
d. The maximum value a float

24.Write a program to convert:
a. float value into String
b. float value into Float instance.
c. String instance into Float instance.
d. float value into hexadecimal string.

25.Write a program to convert state of Float instance into byte,
short, int, long, float and double.

26.Write a program to find minimum and maximum number as well as
to add two float numbers using methods of Float.
 */

package basic_q;

public class FloatType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//23
		System.out.println("number of bits used to represent a Float value : "+Float.SIZE+" bits");
		System.out.println("number of bytes used to represent a Float value : "+Float.BYTES+" Byte");		
		System.out.println("minimum value a Float : "+Float.MIN_VALUE);		
		System.out.println("maximum value a Float : "+Float.MAX_VALUE+"\n");
				
		//24
		//a
		float a = 6969.69f;
		String astr = String.valueOf(a);
		String _astr = Float.toString(a);
		System.out.println("int value into String String.valueOf : "+astr+" Float.tString : "+_astr);
				
		//b
		float b = 6969.69f;
		Float ff = b;
		System.out.println("float value into Float instance : "+ff.toString());
				
		//c
		String cstr = new String("9696.6969");
		Float ic = Float.parseFloat(cstr);
		System.out.println("String instance into Float instance : "+ic.toString());
				
		//d float value into  hexadecimal string.
		float d= 14369.696f;
		String strHex = Float.toHexString(d);
		System.out.println(" Hex float : "+strHex+"\n");
				
		//25		
		//convert state of Integer instance
		Float fConvert = 99969.6969f;
		byte by = fConvert.byteValue(); 
		short bs = fConvert.shortValue();
		int bi = fConvert.intValue();
		long bl = fConvert.longValue();
		double bd = fConvert.doubleValue();
		System.out.println("state of Byte instance into byte : "+by+ "\nshort : "+bs+ "\nint : "+bi
							+ "\nlong : "+bl+"\ndouble : "+bd+"\n");		
				
		//26 sum
		float asum = 100.6969f , bsum = 200.9696f ;
		float sum = Float.sum(asum,bsum);
		System.out.println("Float.sum(a,b) : "+sum);
	}

}
