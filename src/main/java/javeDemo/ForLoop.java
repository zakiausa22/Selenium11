package javeDemo;

public class ForLoop {

	public static void main(String[] args) {
		//print 1 to 10 number
				/*for (int i = 1; i<=20; i=i+1) {
					System.out.println(i);
				}*/
				
				for (int i=1; i<=15;i=i+1) {
					System.out.println(i);
				}
				
				System.out.println("*******************");
				//print all odd number from 1 to 20
				for (int i = 1; i<=20; i=i+2) {
					System.out.println(i);
				}
				System.out.println("*******************");
				
				//Print all even numbers from 0 to 50
				for(int j=0; j <= 50; j=j+2) {
					System.out.println(j);
				}

		System.out.println("*******************");

				//Print all the values from below Arrays (obj) by using for loop
				String[] obj = new String[6];
				obj[0] = "Rinku";
				obj[1] = "Rubel";
				obj[2] = "Shewlee";
				obj[3] = "Ekram";
				obj[4] = "Wadud";
				obj[5] = "xyz";

				//By using loops we can performs various actions/thing
				//for (int i = 0; i<6;i=i+1) {
				//}
				for(int i=0;i<obj.length; i=i+1) {
					System.out.println();
					//System.out.println(i);	//For printing all index number

					//System.out.println(i +" United State of America"); //printing "United State of America"multiple times with index number 
					//System.out.println(obj[i]); // Printing all values from array 
				}	

			}	

	}

          String []names = {"David","Smith","Erika","Priscilla","Regina","Tammy","Paul","Garcia"};

                   //Q 3c)print all names from the list?
              String[] names2 = new String[7];
                     names2[0] = "David";
                      names2[1] = "Smith";
                      names2[2] = "Erika";
                      names2[3] = "Priscilla";
                      names2[4] = "Regina";
                       names2[5] = "Tammy";
                      names2[6] = "Paul";
                       names2[7] = "Garcia";
                       for(String eachnames2 : names2 ) {
       					System.out.println(eachnames2);
       				}
