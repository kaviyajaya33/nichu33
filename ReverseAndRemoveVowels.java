package guviiii;
import java.util.*;
public class ReverseAndRemoveVowels {
public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	String str=in.nextLine();
	String new1="";
	String vow="aeiouAEIOU";
	String str1=new StringBuffer(str).reverse().toString();
	System.out.println(str1);
	for(int i=0;i<str1.length();i++){
			char a=str1.charAt(i);
			String b=Character.toString(a);
			if(vow.contains(b)==true){
				new1=new1+str1.charAt(i+1);
			}else{
				new1=new1+str1.charAt(i);
			}
	}
	System.out.println(new1);
}
}
