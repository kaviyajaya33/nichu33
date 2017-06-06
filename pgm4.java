package trial;
import java.util.Scanner;
public class pgm4 {
public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the character");
	char ch=in.next().charAt(0);
	if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
		System.out.println("the given is an alphabet");
	}else
	{
		System.out.println("the given is not an alphabet");
	}
		
}
}
