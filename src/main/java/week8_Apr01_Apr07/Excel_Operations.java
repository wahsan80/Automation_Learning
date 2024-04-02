package week8_Apr01_Apr07;

public class Excel_Operations {

	public static void main(String[] args) {

		// Step1 - Created the Excel sheet
		// Step2 - add maven dependencies for Excel file - YES
		// Step3 - use a utility file - YES
		// Step4 - Operations that are required (we will code)
		// Path: C:\Users\w_ahs\eclipse-workspace\Auto_Learning\src\main\java\week8_Apr01_Apr07\DataSample.xlsx
		
		String path = System.getProperty("user.dir") + "\\src\\main\\java\\week8_Apr01_Apr07\\DataSample.xlsx";
		
		System.out.println(path);
		
		Xls_Reader xls = new Xls_Reader(path);
		
		// 1. to get the row count
		
		int row = xls.getRowCount("BrowserTest"); // Excel Sheet Name
		System.out.println(row);
		
		//2. to get the column count
		
		int col = xls.getColumnCount("ShoppingTest"); // Excel Sheet Name
		System.out.println(col);
		
		//3. Read data from Excel File
		
		String data = xls.getCellData("ShoppingTest", 2, 3); // Sheet Name, Row, Column
		System.out.println(data);
		
		String data1 = xls.getCellData("ShoppingTest", "ProductName", 4); 
										// Excel Sheet Name, Row Header, Column Number
		System.out.println(data1);
		
		//4. write into excel sheet
		
		xls.setCellData("ShoppingTest", "ProductName", 11, "Testing");
	}

}
