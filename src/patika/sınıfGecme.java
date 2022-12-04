package patika;
import java.util.Scanner;


public class sınıfGecme {

	public static void main(String[] args) {
		/* 
Geçme Notu : 55
*/
		Scanner input =new Scanner(System.in);
		int Matematik,Fizik,Turkce,Kimya,Muzik,top=0,ders=0;
		double ort;
		System.out.println("lütfen Matematik notunu giriniz:");
		Matematik=input.nextInt();
		if(Matematik>0&&Matematik<=100) {
			top=top+Matematik;
		}
		System.out.println("lütfen Fizik notunu giriniz:");
		Fizik=input.nextInt();
		if(Fizik>0&&Fizik<=100) {
			top=top+Fizik;
			ders++;
		}
		
		System.out.println("lütfen Türkçe notunu giriniz:");
		Turkce=input.nextInt();
		if(Turkce>0&&Turkce<=100) {
			top=top+Turkce;
			ders++;
		}
		
		System.out.println("lütfen Kimya notunu giriniz:");
		Kimya=input.nextInt();
		if(Kimya>0&&Kimya<=100) {
			top=top+Kimya;
			ders++;
		}
		System.out.println("lütfen müzik notunu giriniz:");
		Muzik=input.nextInt();
		if(Muzik>0&&Muzik<=100) {
			top=top+Muzik;
			ders++;
		}
		
		if(ders!=0) {
		ort=top/ders;
	System.out.println("ders ortalamanız:"+ort);
	
	if(ort>=55)	{
		System.out.println("tebrikler sınıfı geçtiniz:)");
	}else if(ort<55) {
		System.out.println("üzgünüm sınıfta kaldınız!)");

	}
		}else {
			System.out.println("notlarınız 0 il 100 arasında değil!");
		}
	}

}