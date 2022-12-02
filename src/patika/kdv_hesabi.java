package patika;
import java.util.Scanner;

public class kdv_hesabi {

	public static void main(String[] args) {
		
		double tutar,kdvtutarı,kdvoran1=0.18,kdvoran2=0.08;
		
		Scanner input=new Scanner(System.in);
		System.out.println("lütfen tutar girin:");
		tutar=input.nextDouble();
		
		kdvtutarı=tutar>=1000? tutar*kdvoran1:tutar*kdvoran2;
		tutar=tutar+kdvtutarı;
		System.out.println("tutarınız:"+tutar);

}
}
