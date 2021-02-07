import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public void createTotalSalesReport(String itemName, int itemQuantity, double totalPrice) throws IOException {
	
	File file = new File("TotalSales.rpt");
	file.createNewFile();
	try (FileWriter fileWriter = new FileWriter("TotalSales.rpt", true); BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){

		bufferedWriter.write(itemName + "|"+ itemQuantity + "|" 
									+ "$ " + totalPrice + System.getProperty("line.separator"));


		
}
	
	
public List<String> readLinesFromTotalRPT(){
		
		//*** TOTAL SALES REPORT
		
		// arrayList of strings to hold lines from total sales report
		
		List<String> linesFromTotalSales = new ArrayList<String>();
		
		//scanner will read through the file and add the lines to the list
		
		try (Scanner fileReader = new Scanner("TotalSales.rpt")) {
			while (fileReader.hasNextLine()) {
				linesFromTotalSales.add(fileReader.nextLine());
			}
				return linesFromTotalSales;
		}
public void assignValues() {
			
				List<String> linesFromTotalSales = readLinesFromTotalRPT();
				
				
				for (String line : linesFromTotalSales) {
					String [] arrOfNameQuantityPrice = line.split("\\|");
					String name = arrOfNameQuantityPrice[0];
					int quantity = Integer.parseInt(arrOfNameQuantityPrice[1]);
					double price = Double.parseDouble(arrOfNameQuantityPrice[2]);		
							
							
				}
}