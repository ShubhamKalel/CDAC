/** 
 6.Write a program to perform below operations on Boolean type to
convert:
a. boolean value into String
b. boolean value into Boolean instance.
c. String value into boolean value
d. String value into Boolean instance.
 */

package basic_q;

public class BoolConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a=false;//a
		String s = Boolean.toString(a);
		String _s = String.valueOf(a);
		System.out.println("a : "+s+" |  _a : "+_s);
		
		//b
		boolean b =false;
		Boolean bInst = b;
		System.out.println("b Instance -: "+bInst);
		
		//c
		String cstr = new String("true");
		boolean c = Boolean.parseBoolean(cstr);
		System.out.println("d , boolean value : "+c);
					
	
		//d
		String d = new String("true");
		Boolean dd = Boolean.parseBoolean(d);
		System.out.println("b Instance.toString(): "+dd.toString());
		
		

	
	}

}
