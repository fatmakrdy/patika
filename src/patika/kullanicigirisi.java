package patika;
import java.util.Scanner;
public class kullanicigirisi {

	public static void main(String[] args) {
		String sifre,ad,cevap,yeniSifre;
		
		Scanner input=new Scanner(System.in);
		System.out.println("lütfen isminizi girin:");
		ad=input.nextLine();
		
		System.out.println("lütfen sifrenizi girin:");
		sifre=input.nextLine();
		
		if(ad.equals("fatma")&&sifre.equals("1234")) {
			System.out.println("giriş başarılı:)");
		}
		else if(ad!="fatma"&&sifre.equals("1234")) {
			System.out.println("kullanıcı adı hatalı)");
		}
		else if(ad.equals("fatma")&&sifre!="1234") {
			System.out.println("şifre hatalı\nşifrenizi sıfırlamak ister misiniz?(evet/hayır)");
			cevap=input.nextLine();
			if(cevap.equals("evet")) {
				System.out.println("lütfen yeni şifrenizi girin:");
				yeniSifre=input.nextLine();
				if(yeniSifre.equals("1234")) {
					System.out.println("yeni şifre ile eskisi aynı olamaz");
				}
				System.out.println("şifreniz sıfırlandı...");
			}else if(cevap.equals("hayır")){
				System.out.println("şifreniz hatalı.!");
			}else {
				System.out.println("hatalı bir giriş yaptınız.");
			}
			
		}
		
		
		
	}

}
