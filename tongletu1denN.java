package tongletu1denN;

import java.util.Scanner;

public class tongletu1denN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,i;
		long tongle;
		tongle=0;
		System.out.println("Nhap n: ");
		n=sc.nextInt();
		for (i=0;i<=n;i++)
		if (i%2!=0)
		{
			tongle=tongle+i;
		}
		System.out.println("T?ng l? t? 1 ð?n " + n +" la: " +tongle);
	}

}
