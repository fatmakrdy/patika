package patika;
import java.util.Scanner;
public class siralama {

	public static void main(String[] args) {
		
int a,b,c,eb;//3 sayı için isim
System.out.println("lütfen 3 sayı giriniz:");
Scanner input=new Scanner(System.in);
a=input.nextInt();
b=input.nextInt();
c=input.nextInt();

eb=a;
if(eb<b) {
	eb=b;
}
if(eb<c) {
	eb=c;
}
System.out.println("en büyük sayı "+eb);
	}

}
