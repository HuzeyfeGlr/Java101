import java.util.Scanner;

public class Ödev5 {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double ar , el, dom, muz, pat, total;
        System.out.println("Armut kaç kilo?");
        ar= input.nextDouble();
        System.out.println("Elma kaç kilo?");
        el= input.nextDouble();
        System.out.println("Domates kaç kilo?");
        dom= input.nextDouble();
        System.out.println("Muz kaç kilo?");
        muz= input.nextDouble();
        System.out.println("Patlıcan kaç kilo?");
        pat= input.nextDouble();
        total = ((ar * 2.14) + (el * 3.67) + (dom * 1.11) + (muz * 0.95) + (pat * 5) );
        System.out.print("Ödenmesi gereken tutar: " + total);
    }
}
