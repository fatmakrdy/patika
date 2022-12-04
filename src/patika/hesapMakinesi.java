package patika;
import java.util.Scanner;
public class hesapMakinesi {

	public static void main(String[] args) {
		int islem;
		double a,b;
	System.out.println("lütfen yapmak istediğiniz işlemi seçiniz:\n"
			+ "1-toplama\n2-çıkarma\n3-çarpma\n4-bölme\n");	
    Scanner input=new Scanner(System.in);
    islem=input.nextInt();
    System.out.println("lütfen işlem yapmak istediğiniz iki sayı girin:");
    a=input.nextDouble();
    b=input.nextDouble();
    switch(islem) {
    case 1:
    System.out.println(a+b);
    break;
    
    case 2:
        System.out.println(a-b);
        break;
    
    case 3:
        System.out.println(a*b);
        break;
    
    case 4:
        System.out.println(a/b);
        break;
    default:
    	System.out.println("listede olamayan bir işlem seçtiniz!");
    }
	
	}

}
