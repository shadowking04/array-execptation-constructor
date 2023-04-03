package myproject;

import java.util.Scanner;

public class Testexception {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  Your Number");
		int a,b,c;
		try
		{
			a=sc.nextInt();
			b=sc.nextInt();
			c=a/b;
			System.out.println(c);
		}
		catch (Exception e) {
			System.out.println("Aaj hi jakr apna Eye Test Karvya");
		}

	}

}
