import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class ExceptionHandling {
	
	
	
	
	
	void div() throws FileNotFoundException, InterruptedException{
		FileInputStream fo=new FileInputStream("vvvsvsv");
		Thread.sleep(3000);
		try{
		int division=100/0;
		System.out.println(division);
		}catch(Exception f){
			//System.out.println(f.getMessage());
			f.printStackTrace();
			
		}finally{
			
		}
		
	}
	
	void display(){
		System.out.println("I am in display method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ExceptionHandling  ex=new ExceptionHandling();
		
		ex.display();
	}

}
