
public class MethodOverLoading {
	
	int add;
	void sum(int a,int b){
	add=a+b;
	System.out.println(add);
	}
	
	
	
   void sum(int a,int b,int c){
	   add=a+b+c;
		System.out.println(add);
	}

   void sum(int a,int b,int c,int d){
	   add=a+b+c+d;
		System.out.println(add);
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverLoading obj1=new MethodOverLoading();
		obj1.sum(100, 200);
		obj1.sum(100, 200, 300, 400);
		
	}

}
