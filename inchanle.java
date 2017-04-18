import java.util.Scanner;

public class Nhapsonguyen {

	public static void main(String[] args) 
		{ int a=0;
		Scanner ban_phim = new Scanner(System.in);
	
		System.out.print("Nhap mot so: ");
		a = ban_phim.nextInt();
		String Kq="";
		if (a%2==0)
			Kq="S? ch?n";
		else Kq="S? l?";
		System.out.println("S? v?a nh?p là:" +Kq);
		
		}
}