package patika;
import java.util.Scanner;
public class manavKasa {

	public static void main(String[] args) {
		double armut,elma,domates,muz,patlican,tutar;
		Scanner input =new Scanner(System.in);
		
		System.out.println("ürün fiyat listesi(kg):\n1-Armut : 2,14 TL:\n"
				+ "2-Elma : 3,67 TL\n3-Domates : 1,11 TL\n"
				+ "4-Muz: 0,95 TL\n5-Patlıcan : 5,00 TL");
		
        System.out.println("kaç kg armut almak istersiniz?");
		armut=input.nextDouble();
		
		System.out.println("kaç kg elma almak istersiniz?");
		elma=input.nextDouble();
		
		System.out.println("kaç kg domates almak istersiniz?");
		domates=input.nextDouble();
		
		System.out.println("kaç kg muz almak istersiniz?");
		muz=input.nextDouble();
		
		System.out.println("kaç kg patlıcan almak istersiniz?");
		patlican=input.nextDouble();
		
		tutar=(armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlican*5.00);
	
		System.out.println("toplam tutarınız:"+tutar);
	}

}


