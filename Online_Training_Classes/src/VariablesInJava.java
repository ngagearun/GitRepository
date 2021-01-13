
public class VariablesInJava {
	
	int empid;
	String empname,empemailid;
	static String orgname="HCL Technologies";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=200;

		VariablesInJava employee1=new VariablesInJava();
		employee1.empid=1001;
		employee1.empname="arun";
	
		employee1.empemailid="arun@ofc.com";
		
		
		VariablesInJava employee2=new VariablesInJava();
		employee2.empid=1002;
		employee2.empname="kumar";
		
		employee2.empemailid="kumar@ofc.com";
		
System.out.println("Emp id is :"+employee1.empid+"  Emp name is :"
                 +employee1.empname+"  Org name :"+orgname+"  Employee1 email id:"
		         +employee1.empid);

System.out.println("Emp id is :"+employee2.empid+"  Emp name is :"
        +employee2.empname+"  Org name :"+orgname+"  Employee1 email id:"
        +employee2.empid);
		

	}

}
