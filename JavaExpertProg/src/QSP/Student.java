package QSP;


public class Student {
int roll_no;
String name;
	
static {
	new Student();
	System.out.println("first");
}
	
	public static void main(String[] args) {
		Student s1=new Student();
	 s1.name="fdf";
	 s1.roll_no=12;
	 Student s2=new Student();
	 s2.name="fvndf";
	 s2.roll_no=122;
	 Student s3=new Student();
	 s3.name="fvndwrf";
	 s3.roll_no=1222;
	 new Student();
	 System.out.println();
	 System.out.println(s1.roll_no+s1.name);
	 System.out.println(s2.roll_no+s2.name);
	}
	
	{
	System.out.println(name+"Students joined this class");
	}
	
}
