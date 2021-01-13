
/*Author : Arun
 * Date:20/11/20
 * Modified By:Sam
 * Purpose:Printing the values
 */
 class WelcomeJava {
	 //instance variable
	 int a=200;
	 //static variable
	 static float pi=3.14f;
	 //instance method
	 void display(){
		 int a=100;
	   System.out.println(a);
	   System.out.println(WelcomeJava.pi);
	 }
 
 //static method
     public static void main(String[] args){
    	 //local variables

    	 int accno=1001;
    	 System.out.println(accno);
    	 
    	 WelcomeJava wc=new WelcomeJava();
    	 
    	 System.out.println(wc.a);
    	 wc.display();
    	 
    	 System.out.println(pi);
    	 
    	 
    	 
     }
 }

 