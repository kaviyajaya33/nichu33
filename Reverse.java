package trials;
import java.util.*;
public class Reverse {
public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	System.out.println("enter the word to be reversed");
	String str1=in.next();
	StringBuffer str2=new StringBuffer(str1).reverse();
	System.out.println(str2);
}
}
