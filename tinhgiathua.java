package giaithua;

import java.util.Scanner;

public class giaithua {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int gt=1;	
		System.out.printf("Nhap n: ");
		int n = sc.nextInt();
		for (int i=1;i<=n;i++)
			{gt *= i;}
		System.out.printf(" Ket qua cua " + n +" giai thua la: " +gt);
		}
}
