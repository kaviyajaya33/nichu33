package trial;
import java.util.Scanner;
public class pgm6 {
	public static void main(String[]args){
		int year;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the year");
		year=in.nextInt();
		if(year%400==0){
			System.out.format("%d is the leap year",year);
		}
		else if(year%100==0){
			System.out.format("%d is not the leap year",year);
		}
		else if(year%4==0){
			System.out.format("%d is the leap year",year);
		}
		else{
			System.out.format("%d is not the leap year",year);
		}
	}

}
