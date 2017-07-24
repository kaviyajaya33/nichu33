package guviiii;
import java.util.*;
public class count {
public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	String str=in.nextLine();
	int c=0,d=0,al=0;
	for(int i=0;i<str.length();i++){
		char ch=str.charAt(i);
	if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')){
		c++;
	}
	else if(ch>='0'&&ch<='9'){
		d++;
	}else{
		al++;
	}
}
	System.out.println("char:"+c+"num:"+d+"others:"+al);
}}
