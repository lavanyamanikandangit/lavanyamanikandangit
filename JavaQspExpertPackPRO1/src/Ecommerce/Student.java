package Ecommerce;

public class Student {

	int roll_no;
	String name;
	void study()
	{
	System.out.println("Roll no "+roll_no);
	System.out.println(name+" is studying");
}
	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="lavanya";
		s1.roll_no=12;
		s1.study();
		
		Student s2=new Student();
		s2.name="Ezhilan";
		s2.roll_no=13;
		s2.study();
	}
}
