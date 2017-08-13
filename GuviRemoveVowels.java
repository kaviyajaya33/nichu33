package guvi;
import java.util.*;
public class GuviRemoveVowels {
public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	String str=in.nextLine();
	String res="";
	res=str.replaceAll("[aeiouAEIOU]","");
	System.out.println(res);
}
}
