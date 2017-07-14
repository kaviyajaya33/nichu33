package trials;
import java.util.*;
public class ReverseOfString {
public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	String a=in.next();
	StringBuffer str=new StringBuffer(a).reverse();
	System.out.println(str);
}
}
