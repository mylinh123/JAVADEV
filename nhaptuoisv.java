package nhaptuoisv;

import java.util.Scanner;

public class nhaptuoisv {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tuoi; 
		int Namsinh ;
		Namsinh = sc.nextInt();
		do {
			System.out.println("Nh?p tu?i SV:  (>=13,<=100)");
			tuoi = sc.nextInt();
		}
		while ((tuoi<13)||(tuoi>100));
		System.out.println("Tu?i c?a Sv là: " + tuoi);
	}
}
