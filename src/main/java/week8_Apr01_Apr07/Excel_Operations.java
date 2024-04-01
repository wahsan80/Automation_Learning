package week8_Apr01_Apr07;

public class Excel_Operations {

	public static void main(String[] args) {

		// Step1 - Created the Excel sheet
		// Step2 - add maven dependencies for Excel file - YES
		// Step3 - use a utility file - YES
		// Step4 - Operations that are required (we will code)
		// Path: C:\Users\w_ahs\eclipse-workspace\Auto_Learning\src\main\java\week8_Apr01_Apr07\DataSample.xlsx
		
		String file_path = System.getProperty("user.dir" + "\\src\\main\\java\\week8_Apr01_Apr07\\DataSample.xlsx");
		
		Xls_Reader xls = new Xls_Reader(file_path);
		
		// 1. to get the row count
		
		int row = xls.getRowCount("BrowserTest");
		System.out.println(row);
	}

}
