package dangnhap;

import java.util.Scanner;

public class dangnhap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String tenDN="", mk="";
		Scanner ban_phim = new Scanner(System.in);

		do{
			System.out.print("T�n DN:");
			tenDN = ban_phim.nextLine();
			System.out.print("M?t Kh?u:");
			mk = ban_phim.nextLine();
			if((tenDN.compareTo("DHCN1B")!=0)||(mk.compareTo("123")!=0))
				{System.out.println("B?n �? nh?p sai T�n DN v� M?t Kh?u");}
		}
		while((tenDN.compareTo("DHCN1B")!=0)||(mk.compareTo("123")!=0));
		System.out.println("Welcom to DHCN1B");
	}

}
