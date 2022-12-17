package patika;
import java.util.Scanner;
public class etkinlik_oneri {

	public static void main(String[] args) {

				/*int sicaklik;
				Scanner input =new Scanner(System.in);
				System.out.println("lütfen bir sıcaklık girin:");
				sicaklik =input.nextInt();
				 
				if(sicaklik<5) {
					System.out.println("kayak yapabilirsiniz..");
				}else if(sicaklik<15) {
					System.out.println("sinemaya gidebilirsin");
				}else if(sicaklik<25) {
					System.out.println("piknik yapabilirsin");
				}else {
					System.out.println("yüzmeye gidebilirsin..");
				}
				*/
		int sayi;
System.out.println("Sıcaklık 5'dan küçük ise 1 e basın\nSıcaklık 5 ve 15 arasında ise 2 ye basın\n"
		+ "Sıcaklık 15 ve 25 arasında ise 3 e basın\nSıcaklık 25'ten büyük ise 4 basın\n");
Scanner input =new Scanner(System.in);	
sayi=input.nextInt();
switch (sayi) {
case 1: {
	System.out.println("kayak yapabilirsiniz..");
	break;
}case 2:{
	System.out.println("sinemaya gidebilirsin");
	break;
}case 3:{
	System.out.println("piknik yapabilirsin");
	break;
}case 4:{
	System.out.println("yüzmeye gidebilirsin..");
	break;
}
default:
	System.out.println("hatalı bir ifade girdiniz!");
}
	}

}
