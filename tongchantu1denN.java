package tongchan1denN;

import java.util.Scanner;

public class tongchan1denN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,i=0;
		long tong =0;
		System.out.print("Nhap n: ");
		n = sc.nextInt();
		for (i=0;i<=n;i++)
		if (i%2==0)
			{tong= tong + i;
		}
		System.out.println("K?t qu? là: "+tong);
	}

}
