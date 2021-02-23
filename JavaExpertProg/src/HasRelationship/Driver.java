package HasRelationship;


class parent
{
	public parent()
	{
		System.out.println("Instance of created for parent");
			}

}
class child extends parent
{
	public child()
	{
//		super();
		System.out.println("instance created for child");
	}
}
 class Driver{
	 
	public static void main(String[] args) {
		child c=new child();
		System.out.println("c instance of child");
		System.out.println("c instance of parent");
//		System.out.println("c instance of driver");
	}
	 
	 
	 
 
}
