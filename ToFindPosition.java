package trials;
import java.util.*;
public class ToFindPosition {

public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	int size,c;
	int a[]=new int[5];
	System.out.println("enter the size");
	size=in.nextInt();
	for(int i=0;i<size;i++){
		a[i]=in.nextInt();}
	System.out.println("enter the element to find its position");
	c=in.nextInt();
	for(int i=0;i<size;i++){
		if(a[i]==c){
	System.out.println("index is:"+c+" "+i);
}}}}

