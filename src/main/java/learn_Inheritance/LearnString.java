package learn_Inheritance;

public class LearnString {

	public static void main(String[] args) {
	String text = "String Concept";
	String text1 ="String Concept";
	System.out.println(text+" "+text1 );
	System.out.println(text.concat(text1));
	//Find the memory location/address of this text/text1 varible
	System.out.println(System.identityHashCode(text));
	System.out.println(System.identityHashCode(text1));
	//String Class Method/ function
	//   1.equals()-------Return true or false
	System.out.println(text.equals(text1)); //equal funtion compare the value of two different  variable( text & text1)
	System.out.println("...........1...........");
	//compares memory location/address of string varible
	System.out.println(text == text1); 
	System.out.println(System.identityHashCode(text));
	System.out.println(System.identityHashCode(text1));
	// 2.Length()--return count og string
	 String text2 = "We Learn String concept"; // length=23. it will count blank space also
	 String text3 = "We Learning String";
	 System.out.println(text2.length()); 
	 System.out.println("............2................");
	 //3.Concat() -If we want to concat/join more than one String or two string
	 System.out.println(text2.concat(text3));
	 // if we want to concat different datatype variable, we use +
	 String num = "100";
	 int a = 101;
	int b =99;		 
	 System.out.println(num+a); //  come 100101 not come 201
	 System.out.println(a + b); //it come 200
	 System.out.println("..............3..............");
	 //4.trim()-want to remove white space from both side of a string use trim()
	 String line = "   we Learn Java String Concept  ";
	 System.out.println(line);
	 System.out.println(line.length()); // come 33 with white space
	 System.out.println(line.trim()); //come without white space
	//After use trim()
	 	 System.out.println(line.trim().length()); // come 28
	 	 System.out.println(line.length());
	 	 System.out.println("..........4...........");
	 	 //5. to Lower Case()-covert all of the string as Lowercase()
	 	 String text4 = "Compare String";
	 	 System.out.println(text4.toLowerCase());
	 	 // to upper case()-covert all of the string as uppercase()
	 	String text5 = "Compare String";
	 	System.out.println(text5.toUpperCase());
	 	System.out.println("..............5...............");
	 //	6.contains()-given String is available in entire String or return true/false
	 	System.out.println(text5.contains("mpa"));// true
	 	System.out.println(text5.contains("com"));// false
	 	System.out.println(text4.contains("ing"));//true
	 	System.out.println("...............6.................");
	 
	
	
	
	
	

	}

}
