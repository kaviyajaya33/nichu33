package kk1;
import java.util.*;
public class guviplayer24 {
public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	String str=in.next();
	int count=0;
	String a="1234567890.eE";
	for(int i=0;i<str.length();i++){
		char a1=str.charAt(i);
		for(int j=0;j<a.length();j++){
			char a2=a.charAt(j);
			if(a1==a2){
		         count++;
			}
		}
	}
	if((count!=0)&&(count==str.length())){
		System.out.println("true");
	}else{
		System.out.println("false");
	}
}
}
