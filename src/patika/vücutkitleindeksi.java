package patika;
import java.util.Scanner;
public class vücutkitleindeksi {

	public static void main(String[] args) {
	//Kilo (kg) / Boy(m) * Boy(m)
		double kilo,boy,vki;
		Scanner input=new Scanner(System.in);
		System.out.println("Vücut Kitle İndeksi Hesaplama...");
		System.out.println("lütfen kilonuzu kilogram cinsinden giriniz:");
		kilo=input.nextDouble();
		System.out.println("lütfen boyunuzu metre cinsinden giriniz:");
        boy=input.nextDouble();
        
        vki=kilo/(boy*boy);
        System.out.println("girilen bilgilere göre "
        		+ "vücut kitle indeksiniz:"+vki);
		
	}

}
