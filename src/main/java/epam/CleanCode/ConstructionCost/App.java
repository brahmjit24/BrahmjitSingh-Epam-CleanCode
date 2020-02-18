package epam.CleanCode.ConstructionCost;

import java.util.Scanner;




public class App {
	static {
		int type;
		double area;
		
		Scanner scan=new Scanner(System.in);
		System.out.format("%s","Enter value For Construction type : \n");
		System.out.format("%s","Press 1 - Standard Type\n");
		System.out.format("%s","Press 2 - Above Standard Type\n");
		System.out.format("%s","Press 3 - High Standard Type\n");
		System.out.format("%s","Press 4 - High Standard Type + Automation \n");
		type=scan.nextInt();
		System.out.format("%s","Enter House Area \n");
		area=scan.nextDouble();
		scan.close();
		
		Construction c=new Construction();
		c.setConstructionData(type, area);
		c.calculateTotalCost();
		c.displayResult();
	}
  public static void main(String[] args) {
	
  }
}
