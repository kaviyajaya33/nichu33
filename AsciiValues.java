package guvii;
import java.util.*;
public class AsciiValues {
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		String input1="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String input2="abcdefghijklmnopqrstuvwxyz";
	    char []input11=input1.toCharArray();
	    char []input22=input2.toCharArray();
	    for(int i=0;i<input1.length();i++){
	    	int c=(int)(input11[i]);
	    	System.out.println(input11[i]+" "+c);
	    }
	    for(int j=0;j<input2.length();j++){
	    	int d=(int)(input22[j]);
	    	System.out.println(input22[j]+" "+d);
	    }

	}
}
