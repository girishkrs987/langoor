package Utility;

import java.util.ArrayList;

public class Testutil {
	
	// create one method get data ffrom xl file by using Apachi pOi jar files and pass to the specific
	
	// webelement 
	static Xls_Reader reader; 
	public static void main(String[] args) {
		getDataFromExcel();
		
	
	}
	public static ArrayList<Object[]> getDataFromExcel(){ // this is method to get data from xl file
		
		ArrayList<Object[]> mydata= new ArrayList<Object[]>();
		
		reader=new Xls_Reader("C:\\Users\\Girish\\eclipse-workspace\\BETADOCNUCOM\\src\\main\\java\\Test_Data\\TestData.xlsx");
		//reader=new Xls_Reader();
		for (int rownum=2; rownum<=reader.getRowCount("Patient_Reg"); rownum++  ) {
			
			String Prefix=reader.getCellData("Patient_Reg", "Prefix", rownum);
			
			//reader.getCellData(sheetName, colName, rowNum)
			
			
			//System.out.println(Prefix);
			String Firstname=reader.getCellData("Patient_Reg", "Firstname", rownum); 
			String Gender=reader.getCellData("Patient_Reg", "Gender", rownum);
			String Age=reader.getCellData("Patient_Reg", "Age", rownum);
			String Mobile=reader.getCellData("Patient_Reg", "Mobile", rownum);
			String City=reader.getCellData("Patient_Reg", "City", rownum);
			//String Firstname=reader.getCellData("Patient_Reg", "Firstname", rownum);
			
//			Object ab[]=new Object[5];
//			ab[0]=Prefix;
//			ab[1]=Firstname;
//			ab[2]=Gender;
//			ab[2]=Age;
//			ab[2]=Mobile;
//			ab[2]=City;
//			ab[2]=Gender;
//			ab[2]=Gender;
//			ab[2]=Gender;
			
			Object ab[]= {Prefix,Firstname,Gender,Age,Mobile,City};
			mydata.add(ab);
			
			
			
			
		}
		
		return mydata;
		
		
	}
	
	

}
