/**
 * Write a program to perform below operations on byte type to get:

a. The number of bits used to represent a byte value
b. The number of bytes used to represent a byte value
c. The minimum value a byte
d. The maximum value a byte

8.Write a program to convert:

a. byte value into String
b. byte value into Byte instance.
c. String instance into Byte instance.

9.Write a program to convert state of Byte instance into byte,

short, int. long, float and double.

 */

package basic_q;

public class ByteType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a
		System.out.println("number of bits used to represent a byte value : "+Byte.SIZE+" bits");
		//b
		System.out.println("number of bytes used to represent a byte value : "+Byte.BYTES+" Byte");
		//c
		System.out.println("minimum value a byte : "+Byte.MIN_VALUE);
		//d
		System.out.println("maximum value a byte : "+Byte.MAX_VALUE+"\n");
		
		//Convert
		//a
		byte a = 55;
		String astr =  Byte.toString(a);
		System.out.println("byte value into String : "+astr);
		//b
		byte b = 66 ;
		Byte bb = b;
		System.out.println("byte value into Byte instance. : "+bb.toString());
		//c
		String cstr = new String("77");
		Byte cc = Byte.parseByte(cstr);
		System.out.println("String instance into Byte instance. : "+cc+"\n");	
		
		//Convert
		Byte bconvert = 99;
		byte bbb = bconvert.byteValue();
		short bs = bbb;
		int bi = bbb;
		long bl = bbb;
		float bf = bbb;
		double bd = bbb;
		System.out.println("state of Byte instance into byte : "+bbb+ "\nshort : "+bs+ "\nint : "+bi
				+ "\nlong : "+bl+ "\nfloat : "+bf+ "\ndouble : "+bd);
		
	}

}
