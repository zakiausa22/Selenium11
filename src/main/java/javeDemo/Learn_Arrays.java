package javeDemo;

public class Learn_Arrays {

	public static void main(String[] args) {
		//Way 1
				//String []names = {"Sarwath", "Shah", "Eva", "Nilufar", "Wadud", "Tasnim", "Mamun", "Sayed"};
				//Get count of Array - array.length
				//System.out.println(names.length);

				//Print particular item/data from Array
				//System.out.println(names[0]);
			//	System.out.println(names[5]);
				
			//	int [] id = {10,20,30,40,50,60,70,80};
				//System.out.println(id.length);
				//System.out.println(id[4]);
				
				//Way 2 : By using/creating object
				//ClassName obj = new ClassName
				//String [] emp = new String [5];
				//emp[0]= "Sarwath";
				//emp[1]= "Mamun";
				//emp[2]= "Shah";
				//emp[3]= "Eva";
				//emp[4]= "Nilifur";
				
				//Get count of Array - array.length
				//System.out.println(emp.length);
				
				//Print particular item/data from Array
				//System.out.println(emp[3]); 
			//	HOMEWORK
		//	1Ans.Write&Explain the Syntax of Arrays
			//Datatype[]arrays= {values seperated by comma};
				//2Ans
				//int[]marks= {60,65,70,78,80,86,90,92,95};
		// Q a)print a particular index value from the array
				//System.out.println(marks.length); //Ans below
				//System.out.println(marks[1]);
		//Q b)print gets count of array
				//System.out.println(names.length); //Ans below
				//System.out.println(marks[8]);
		//Q c)print all value from the array(not covered) //
			
		//Q & ANS 3a)List of employee names working in Walmart //ANS Below
				//Employee name=David,Smith,Erika,Priscilla,Regina,Tammy,Paul,Garcia
		//	 String []names = {"David","Smith","Erika","Priscilla","Regina","Tammy","Paul","Garcia"};
				//a)Print Prisicilla from the list
		//	 System.out.println(names.length);
		//	 System.out.println(names[3]);
			//Q 3b)print gets count of list?  Ans below
			
				
				String []emp = {"David","Smith","Erika","Priscilla","Regina","Tammy","Paul","Garcia"};
			//System.out.println(emp.length);
			//
			// WAY-2for (int i = 0; i < emp.length; i++) {
			    //  System.out.println(emp[i]);}
			//String []emp = new String [7];
				//emp[0]= "David";
			//	emp[1]= "Smith";
			//	emp[2]= "Erika";
				//emp[3]= "priscilla";
			   // emp[4]= "Regina";
				//emp[5]= "Tammy";
				//emp[6]= "paul";
				//emp[7]= "Garcia";
				//emp[8]= "aaa";
			//Q 3c)print all names from the list?     Ans below
			//for each loop
				//Syntax
				/*for(DataType eachCollections : Collection){
							Statement(eachCollections );
							}*/
			 for(String eachemp : emp ) {
					System.out.println(eachemp);
				}
				System.out.println(".....................................");

				String []emp = new String [7];
				emp[0]= "David";
				emp[1]= "Smith";
				emp[2]= "Erika";
				emp[3]= "priscilla";
			    emp[4]= "Regina";
				emp[5]= "Tammy";
				emp[6]= "paul";
				emp[7]= "Garcia";
				
			//for (String eachemp : emp {
				System.out.println(eachemp);
	//		}
		//Q 4)what is the limitations of arrays?    Ans below
				//1)When we create an array we have to mention the index of array or number of array or size of array.
                //2)Can't print any value out of index
				

		//Q 5)when we try to print a value of out of limit of Arrays, what will happen?   //Ans below
				/*When we create array we have to mention index of array or length of array and if we want to print more than the 
				index number it will through an Exception" ArrayIndexOutOfBoundsExecption"*/

				
				
				
				
				
				

				
				
	}

}
