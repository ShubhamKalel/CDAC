/**
 12.Write a program to perform below operations on short type to
get:
a. The number of bits used to represent a short value
b. The number of bytes used to represent a short value
c. The minimum value a short
d. The maximum value a short

13.Write a program to convert:
a. short value into String
b. short value into Short instance.
c. String instance into Short instance.

14.Write a program to convert state of Short instance into byte,
short, int, long, float and double.
  
  */

package basic_q;

public class ShortTyep {

	public static void main(String[] args) {
	//12
	System.out.println("number of bits used to represent a Short value : "+Short.SIZE+" bits");
	System.out.println("number of bytes used to represent a Short value : "+Short.BYTES+" Byte");			
	System.out.println("minimum value a Short : "+Short.MIN_VALUE);
	System.out.println("maximum value a Short : "+Short.MAX_VALUE+"\n");
				
	//13
	//a
	short a = 696;
	String astr = String.valueOf(a);
	String _astr = Short.toString(a);
	System.out.println("int value into String String.valueOf : "+astr+" Short.tString : "+_astr);
				
	//b
	short b = 6969;
	Short ss = b;
	System.out.println("int value into Integer instance : "+ss.toString());
				
	//c
	String cstr = new String("9696");
	Short sc = Short.parseShort(cstr);
	System.out.println("String instance into Integer instance : "+sc.toString());

				
	//convert state of Short	 instance
	Short sConvert = 9995;
	byte by = sConvert.byteValue(); 
	int bi = sConvert;
	long bl = sConvert;
	float bf = sConvert;
	double bd = sConvert;
	System.out.println("state of Byte instance into byte : "+by+ "\nint : "+bi
						+ "\nlong : "+bl+ "\nfloat : "+bf+ "\ndouble : "+bd+"\n");		

		
		
		
	}

}
