/**

 11.Accept character from command line and perform below
operations. Here you can use charAt() method to extract
character:
a. Check whether entered character is letter or digit. If it
is digit then print its values as well as code point.

b. If it is character then check whether it is in lowercase?
If it is in lowercase then convert it into upper case and
print it well as its code point. If it is in uppercasethen convert it into lower case and print it well as its
code point.
*/
// Supply only one argument
class CharOrDig{

	public static void main(String[] args){// java Classname args[0] 
		String str = args[0];
		System.out.print("hey ! "+str+"\n");
		
		int len = str.length();
		for(int i=0 ; i<len ; i++) {
			if(Character.isDigit(str.charAt(i))) {  //a
				System.out.println("Digit  : "+str.charAt(i)+" Code point : "+str.codePointAt(i));
			}else if(Character.isLetter(str.charAt(i))) {  //b
				if(Character.isLowerCase(str.charAt(i))) {
					System.out.println("Letter : "+str.charAt(i)+" Code Point : "+str.codePointAt(i)
					+" low->Up : "+Character.toUpperCase(str.charAt(i))
					);
				}else if(Character.isUpperCase(str.charAt(i))){
					System.out.println("Letter : "+str.charAt(i)+" Code Point : "+str.codePointAt(i)
					+" Up->Low : "+Character.toLowerCase(str.charAt(i))
					);
				}
			}		
//			System.out.println(str.charAt(i)+" ");
		}
		
		//b
	}
}