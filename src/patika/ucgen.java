package patika;
import java.util.Scanner;
public class ucgen {

	public static void main(String[] args) {
		double kenar1,kenar2,kenar3,alan,cevre,u;
		Scanner input=new Scanner(System.in);
		
		System.out.println("lütfen üçgenin 1.kenarını giriniz:");
        kenar1=input.nextDouble();
        System.out.println("lütfen üçgenin 2.kenarını giriniz:");
        kenar2=input.nextDouble();
        System.out.println("lütfen üçgenin 3.kenarını giriniz:");
        kenar3=input.nextDouble();
     
	    u=(kenar1+kenar2+kenar3)/2;
	    cevre=2*u;
	    alan=Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));
        System.out.println("üçgenin alanı:"+alan);
		System.out.println("üçgenin çevresi:"+cevre);
		
	}

}
