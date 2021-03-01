package route360;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;



public class Trip extends Driver {

	public void getTimes() throws ParseException, IOException {
		
		double avgSpeed=0;
		
		 File file = new File("src/route360/Drivers.txt");
		 FileWriter fw;
		 fw=new FileWriter(file ,true);
		 BufferedWriter bw=new BufferedWriter (fw);
		 
		 Scanner scan = new Scanner(System.in);
		 
		System.out.println("Enter Start Time (hh:mm aa):");
		String startTime = scan.nextLine();		
		
		System.out.println("Enter End Time (hh:mm aa):");
		String endTime = scan.nextLine();
		
		System.out.println("Enter Miles Driver with decimals like: '15.2' miles");
		double milesDriven=scan.nextDouble();
		
		
		
		DateFormat sdf= new SimpleDateFormat("hh:mm aa");
		Date startD=sdf.parse(startTime);
		Date endD= sdf.parse(endTime);
		System.out.println("Time: " +sdf.format(startD));
		bw.write("Started Driving At: "+ startD);
		bw.newLine();
		
		System.out.println("Time: " + sdf.format(endD));
		bw.write("Stopped Driving At:" + endD);
		bw.newLine();
		bw.write((int)milesDriven);
		if(endD.after(startD)) {
			long diffTime= endD.getTime()- startD.getTime();
			long diffMins= (diffTime/(1000*60)%60);
			long diffSec= (diffTime/1000)%60;
			long diffHr= (diffTime/(1000*60*60)%24);
			long min = diffSec / 60;
			long sec = diffSec % 60;
			System.out.println("The Differnce is "+ diffMins+ " minutes and "+diffSec+" seconds");
			bw.write("The Differnce is "+ diffMins+ " minutes and "+diffSec+" seconds");
			bw.newLine();
			avgSpeed=(60*milesDriven)/(diffMins+(diffSec/60));
			bw.write("The Average Speed of the Driver "+getDriverFirstName()+" "+getDriverLastName()+ " is "+ avgSpeed);
			System.out.println("The Average Speed of the Driver "+getDriverFirstName()+" "+getDriverLastName()+ " is "+ avgSpeed+ " m/h");
		}
		if(startD.before(endD)) {
			long diffTime= startD.getTime()- endD.getTime();
			long diffMins= (diffTime/(1000*60)%60);
			long diffSec= (diffTime/1000)%60;
			long diffHr= (diffTime/(1000*60*60)%24);
			long min = diffSec / 60;
			long sec = diffSec % 60;
			System.out.println("The Differnce is "+diffHr+" hours "+ diffMins+ " minutes and "+diffSec+" seconds");
			bw.write("The Differnce is "+ diffMins+ " minutes and "+diffSec+" seconds");
			bw.newLine();
			avgSpeed=(60*milesDriven)/(diffMins+(diffSec/60));
			bw.write("The Average Speed of the Driver "+getDriverFirstName()+" "+getDriverLastName()+ " is "+ avgSpeed);
			System.out.println("The Average Speed of the Driver "+getDriverFirstName()+" "+getDriverLastName()+ " is "+ avgSpeed+ " m/h");
		}
		if(startD.equals(endD)) {
			long diffTime= startD.getTime()- endD.getTime();
			long diffMins= (diffTime/(1000*60)%60);
			long diffSec= (diffTime/1000)%60;
			long diffHr= (diffTime/(1000*60*60)%24);
			long min = diffSec / 60;
			long sec = diffSec % 60;
			System.out.println("The Differnce is "+ diffMins+ " minutes and "+diffSec+" seconds");
			bw.write("The Differnce is "+ diffMins+ " minutes and "+diffSec+" seconds");
			bw.newLine();
			avgSpeed=(60*milesDriven)/(diffMins+(diffSec/60));
			bw.write("The Average Speed of the Driver "+getDriverFirstName()+" "+getDriverLastName()+ " is "+ avgSpeed);
			System.out.println("The Average Speed of the Driver "+getDriverFirstName()+" "+getDriverLastName()+ " is "+ avgSpeed+ " m/h");
		}

	}

}
