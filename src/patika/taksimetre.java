package patika;
import java.util.Scanner;
public class taksimetre {
	public static void main(String[] args) {
	double yol,ucret;
	Scanner input=new Scanner(System.in);
	System.out.println("lütfen gideceğiniz yolu km cinsinden söyleyin:");
    yol=input.nextInt();
	
if(yol==0) {
	ucret=20;
}else {
	ucret=(yol*2.20)+10;
}
	System.out.println("yol ücretiniz:"+ucret);
	
	
	}

}
 