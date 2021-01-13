
abstract class Shape{
abstract void calculatearea();
}
//In real scenario, implementation is provided by others i.e. unknown by end user
class Rectangle extends Shape{
	
	
void calculatearea(){System.out.println(100*200*5);}
}

class Circle1 extends Shape{
 void calculatearea(){System.out.println(200*200);}
}

//In real scenario, method is called by programmer or user
class TestAbstraction1{
public static void main(String args[]){
Shape s;
s=new Rectangle();//In real scenario, object is provided through method e.g. getShape() method
s.calculatearea();

s=new Circle1();
s.calculatearea();
}
}
