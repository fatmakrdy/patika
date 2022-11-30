package patika;
import java.util.Scanner;
public class gecti_kaldi {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int fizik,kimya,turkce,tarih,muzik,ort;
		
		System.out.println("lütfen fizik notunu giriniz:");
		fizik=input.nextInt();
		
		System.out.println("lütfen kimya notunu giriniz:");
		kimya=input.nextInt();
		
		System.out.println("lütfen türkçe notunu giriniz:");
		turkce=input.nextInt();
		
		System.out.println("lütfen tarih notunu giriniz:");
		tarih=input.nextInt();
		
		System.out.println("lütfen müzik notunu giriniz:");
		muzik=input.nextInt();
		
		ort=(fizik+kimya+turkce+tarih+muzik)/5;
		System.out.println("ortalamanız: "+ort);
		
	    String sonuc = (ort>60) ? "Sınıfı geçtiniz" : "Sınıfta kaldınız";
	    System.out.println(sonuc);
		
		
	}

}
