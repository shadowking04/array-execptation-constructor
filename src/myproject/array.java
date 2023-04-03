package myproject;
import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		int a[]= new int[50];
		int c1=0,c2=0,c3=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your array");
		for(int i=1;i<50;i++)
		{
			a[i]=i;
		}
		
			System.out.print("Array: ");
			for(int i=1;i<50;i++) {
			System.out.print(a[i]);
			System.out.print("");}
		
			System.out.println("");
			System.out.print("divisible by 3: ");
			for(int i=1;i<50;i++) {
				if (i%3==0) {
			System.out.print(a[i]);
			System.out.print("");
				}}
			System.out.println("");
			System.out.print("divisible by 4: ");
			for(int i=1;i<50;i++) {
				if (i%4==0) {
			System.out.print(a[i]);
			System.out.print("");
				}}
			System.out.println("");
			System.out.print("divisible by 5: ");
			for(int i=1;i<50;i++) {
				if (i%5==0) {
			System.out.print(a[i]);
			System.out.print("");
				}}
	
	
	}
	}
	
