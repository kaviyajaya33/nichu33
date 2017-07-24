package guviiii;
import java.util.*;
public class CountingNo {
public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	String str=in.nextLine();
	String str1;
	int word=1;
	for(int i=0;i<str.length()-1;i++){
		char c=str.charAt(i);
		char d=str.charAt(i+1);
		if((c==' ')&&(d!=' ')){
		str1=str.substring(0,i);
		int v=str1.length();
		word++;
	}
}
	System.out.println("no of words:"+word);
}}
