package patika;
import java.util.Scanner;
public class daire {

	public static void main(String[] args) {
		double yaricap,alan,cevre,aci,dilimAlani;
		final double PI=3.14;
		Scanner input =new Scanner(System.in);
		System.out.println("lütfen daire yarıçapını girin:");
        yaricap=input.nextDouble();
		alan=PI*yaricap*yaricap;
		cevre=2*PI*yaricap;
		System.out.println("daire alanı:"+alan);
		System.out.println("daire cevresi:"+cevre);
		System.out.println("lütfen alanını bulmak istediğiniz daire dilimine karşılık "
				+ "gelen açıyı girin:");
		aci=input.nextDouble();
		dilimAlani=(PI*(yaricap*yaricap)*aci)/360;
		System.out.println("daire diliminin alanı:"+dilimAlani);
	}

}
