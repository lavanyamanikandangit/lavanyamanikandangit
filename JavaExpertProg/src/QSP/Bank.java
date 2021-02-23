package QSP;


	//abstraction
	abstract  class Bank1
	{
		int amount=10000;
		float term= 1.5f;
		abstract double getInterest();
	}

	class Sbi extends Bank1
	{
		 double getInterest(){
			System.out.println("return 4%");
			return (amount*4*term)/100;
		}
	}
	class axis extends Bank1
	{
		 double getInterest(){
			System.out.println("return 11%");
			return (amount*11*term)/100;
		}
	}
	class icici extends Bank1
	{
		 double getInterest(){
			System.out.println("return 7%");
			return (amount*7*term)/100;
		}
	}
	class Bank
	{
		public static void main(String[] args) {
			Bank1 b;
	System.out.println("SBI:"+(b=new Sbi()).getInterest());
	System.out.println("Axis:"+(b=new axis()).getInterest());
	System.out.println("Icici:"+(b=new icici()).getInterest());
		}
	
}
