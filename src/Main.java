import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        double tutar;
        double kdv=0.18;
        Scanner input= new Scanner(System.in);
        System.out.println("KDV oranı hesaplama");
        System.out.println("-------------------");

        System.out.print("Tutarı giriniz : ");
        tutar=input.nextDouble();
        if(tutar>1000) {
            kdv=0.08;
        }
        System.out.println("Girilen Tutar :"+tutar);
        tutar+=tutar*kdv;
        System.out.println("KDV Oranı : "+kdv);
        System.out.println("KDV'li tutar : "+new DecimalFormat("#.#").format(tutar));

    }
}
