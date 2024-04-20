//Answer 1 & 2
public class AnimalJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animal obj = New Animal();
	
		AnimalJava obj =new AnimalJava();
		obj.leg();
		obj.eye();
		obj.head();
		obj.body();
		//obj.num(a);
		
		//Answer 3
	
		obj.leg();
		obj.eye();
		obj.head();
		obj.body();
		//obj.num(a);
	//	non-static method

	
	}
              //System.out.println("Java");
             
             public void leg() {
            	 System.out.println("Animal leg");
             }
             private void eye(){
            	 System.out.println("Animal eye");
             } 
             
             void head() {
            	 System.out.println("Animal head");
             }
  	  protected void body() {
  }
  	  public int num(int a) {
  		  System.out.println(a);
  		return a;  
  	  }

}