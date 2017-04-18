package onetuti;

import java.util.Scanner;

public class onetuti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("====================================");
		System.out.println("================TEXT================");
		System.out.println("=========1:Búa==2:Bao==3:Kéo========");
		System.out.println("================TEXT================");
		System.out.println("====================================");
		Scanner sc = new Scanner(System.in);
		String kq = null;
			
		while (true){
			// B?n
			System.out.println("B?n ra:");
			byte ban=sc.nextByte();
			if((ban<4)&&(ban>0))
				{
				//Tôi
					byte toi = (byte)(Math.random()*4);
					System.out.println("Tôi ra: "+toi);
				//X? l? th?ng thua ? ðây
					if (ban==toi) kq= "h?a";
					else {
						if ((ban==1)&&(toi==2)) kq="tôi th?ng";
						if ((ban==1)&&(toi==3)) kq="b?n th?ng";
						if ((ban==2)&&(toi==1)) kq="b?n th?ng";
						if ((ban==2)&&(toi==3)) kq="tôi th?ng";
						if ((ban==3)&&(toi==1)) kq="tôi th?ng";
						if ((ban==3)&&(toi==2)) kq="b?n th?ng";
						}
					System.out.println("Ngý?i th?ng là:" + kq);
				//H?i có ti?p t?c
				System.out.println("Ti?p t?c:?(C/K)");
				//	System.out.println("Ti?p t?c:?(C/K)" +(Yes/No));
			
				String tiep = sc.nextLine();
				if (tiep.contains("K")) break;
				}
			else
	 System.out.println("B?n nh?p chýa ðúng nhé ===1:Búa==2:Bao==3:Kéo===");
	}}
}
