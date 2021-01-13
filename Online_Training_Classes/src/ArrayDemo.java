import java.util.Scanner;


public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     int stdrollno[]={1001,1002,1003,1004,1005,1006};
     String str[]={"Arun"};
     
     for(String st1 :str ){
    	 System.out.println(st1);
     }










//		
//		String countries[]=new String[5];
//		
//		Scanner sc=new Scanner(System.in);
//				
//		for(int i=0;i<5;i++){
//			countries[i]=sc.next();
//		}
//		
//		for(int i=0;i<5;i++){
//			System.out.println(countries[i]);	
//		}
//		
		
		int arr[][]={    {10,20,30,40},
				         {30,40,50,60},
				         {60,70,80,90}
		};
		
		for(int row=0;row<arr.length;row++){
			
			
			
			for(int col=0;col<arr[row].length;col++){
				
				System.out.println(arr[row][col]);
			}
		}
		

	}

}
