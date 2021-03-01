package route360;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Driver {

	
	static String driverFirstName;
	static String driverLastName;
	
	public String getDriverFirstName() {
		return driverFirstName;
	}
	public void setDriverFirstName(String driverFirstName) {
		this.driverFirstName = driverFirstName;
	}
	public String getDriverLastName() {
		return driverLastName;
	}
	public void setDriverLastName(String driverLastName) {
		this.driverLastName = driverLastName;
	}
	@Override
	public String toString() {
		return "Driver [driverFirstName=" + driverFirstName + ", driverLastName=" + driverLastName + "]";
	}
	
	
	   public void getNames() {
		   File file = new File("src/route360/Drivers.txt");
		   Scanner scan= new Scanner(System.in);
		   System.out.println("Enter Drivers First Name");
		   FileWriter fw;
		   try {
			   fw=new FileWriter(file ,true);
			   BufferedWriter bw=new BufferedWriter (fw);
			   setDriverFirstName(scan.next().trim().toUpperCase());
			   bw.write(getDriverFirstName());
			   bw.newLine();
			   System.out.println("Enter Last Name");
			   setDriverLastName(scan.next().trim().toUpperCase());
			   bw.write(getDriverLastName());
			   
			   bw.close();
		   }catch(IOException e) {
			   System.err.println("Cannot write on file");
		   }
		   
		   
		   
	   }
	
}
