package guviiii;
import java.util.*;
public class workingDays {
public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	String inday=in.next();
	String[]days={"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
	if(days[1].contains(inday)||days[2].contains(inday)||days[3].contains(inday)||days[4].contains(inday)||days[5].contains(inday)||days[6].contains(inday)){
			System.out.println("true");
			
		}
		if(days[0].contains(inday)){
			System.out.println("false");
			
		}
	}
}

