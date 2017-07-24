package guviiii;
import java.util.*;
public class CountingNoOfChar {
public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	String str=in.nextLine();
	int count=0;
	for(int i=0;i<str.length();i++){
		char c=str.charAt(i);
		if((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
			count++;
		}
	}
	System.out.println("char:"+count);
}
}
