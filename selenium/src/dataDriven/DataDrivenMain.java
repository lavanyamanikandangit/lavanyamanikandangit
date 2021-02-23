package dataDriven;

public class DataDrivenMain {
public static void main(String[] args) throws Throwable {
	
	FileLib flib=new FileLib();
	int rc=flib.getRowCount("./data/input data.xlsx", "data");
//	flib.setCellData("./data/input data.xlsx", "data",5,3, "you can");
	int cc=flib.getCellCount("./data/input data.xlsx", "data");
	
//	System.out.println(rc);
//	System.out.println(cc);
//	
	for(int i=1;i<=rc;i++) 
	{
		String rval,cval;
		rval = flib.getCellData("./data/input data.xlsx", "data", i, 1);
		System.out.println(rval);
		for(int j=1;j<=cc;j++) {
		
		cval = flib.getCellData("./data/input data.xlsx", "data", 1, j);
		System.out.print("\t"+cval);
//		
		}
		
	}
	
}
	
}
