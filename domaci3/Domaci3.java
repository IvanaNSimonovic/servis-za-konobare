package domaci3;

import java.util.Scanner;

public class Domaci3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum1=0,sum2=0;
		System.out.println("Dobrodosli u pametni servis za konobare! Unesite porudzbine:");
		while(true) {
			int s=sc.nextInt();
			
			if(s==0)break;
			else {
				switch(s) {
					case 1:sum1=sum1+60;break;
					case 2:sum1=sum1+60;break;
					case 3:sum1=sum1+100;break;
					case 4:sum1=sum1+120;break;
					case 41:sum2=sum2+250;break;
					case 42:sum2=sum2+240;break;
					case 43:sum2=sum2+290;break;
					default:System.out.println("error");break;
				          }
		         }
        }
		System.out.println("ukupno popijeno: "+sum1+" zarada: "+(sum1*0.1));
		System.out.println("ukupno pojedeno: "+sum2+" zarada: "+(sum2*0.15));
		System.out.println("ukupna zarada: "+((sum1*0.1)+(sum2*0.15)));
    }
}
 