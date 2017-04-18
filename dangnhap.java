package dangnhap;

import java.util.Scanner;

public class dangnhap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String tenDN="", mk="";
		Scanner ban_phim = new Scanner(System.in);

		do{
			System.out.print("Tên DN:");
			tenDN = ban_phim.nextLine();
			System.out.print("M?t Kh?u:");
			mk = ban_phim.nextLine();
			if((tenDN.compareTo("DHCN1B")!=0)||(mk.compareTo("123")!=0))
				{System.out.println("B?n ð? nh?p sai Tên DN và M?t Kh?u");}
		}
		while((tenDN.compareTo("DHCN1B")!=0)||(mk.compareTo("123")!=0));
		System.out.println("Welcom to DHCN1B");
	}

}
