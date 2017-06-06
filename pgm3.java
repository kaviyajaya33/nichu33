package trial;
import java.util.Scanner;
public class pgm3 {
public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	System.out.println("enter the character");
	char ch=in.next().charAt(0);
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	{
		System.out.println("the given is vowel");
	}
	else
	{
		System.out.println("the given is consonant");
	}
}
}
