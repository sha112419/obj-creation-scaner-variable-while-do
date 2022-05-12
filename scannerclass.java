package sha;

import java.util.Scanner;

public class scannerclass {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the value");
		int a=s.nextInt();
		System.out.println("enter the second value");
		int b=s.nextInt();
		int f=a+b;
		System.out.println(f);
		int e=a-b;
		System.out.println(e);
		int j=a*b;
		System.out.println(j);
		int m=a/b;
		System.out.println(m);
       System.out.println("enter the name");
		String name=s.next();
		System.out.println(name);
	}

}
