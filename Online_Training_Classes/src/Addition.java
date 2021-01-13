import java.util.Scanner;

public  class Addition {
	
	int add;
	   //non abstract method or implementation
		int sum(int num1,int num2){
		add=num1+num2;
		return add;
		//System.out.println(add);
	}
		
     

	public static void main(String[] args) {
		
		Addition obj1=new Addition();
		int num1=obj1.sum(200, 2000);
		obj1.sum(200, 400);
		obj1.sum(300, 400);
		obj1.sum(44, 400);
		obj1.sum(3223, 400);
		
		
		Scanner sc=new Scanner(System.in);
		String name =sc.next();
		String fname=sc.next();
		System.out.println(name);
		System.out.println(fname);
		

	}

}
