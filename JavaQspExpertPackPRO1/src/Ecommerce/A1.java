package Ecommerce;

public class A1 {
	
	    
	    int id;
	    String name;

	    public A1(String name, int id)
	    {
	        this.name=name;
	        this.id=id;
	    }

	    @Override
	    public String toString()
	    {
	        return name+"\t"+id;
	    }
	    public static void main(String[] args) {
	        
	        Object [] a = new Object[5];
	        int prodCount=0;
	        for( int i =0;i<a.length;i++)
	            System.out.println(a[i]);

	        a[prodCount++]=new A1("abcd",101);
	        a[1]=new A1("Xyz",999);
	        a[2]=new A1("erteXyz",679);
	        a[3]=new A1("Xyz",999);
	        a[4]=new A1("Xyz",999);
	        for( int i =0;i<a.length;i++)
	        {
	        System.out.println(a[i]);
	        }
	        System.out.println("Choose to Buy:"+a[2]);
	    }
	}

