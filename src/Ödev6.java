import java.util.Scanner;
public class Ödev6 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double n1, n2 ;
        System.out.print("Lütfen 1. sayıyı giriniz:");
        n1 = input.nextDouble();
        System.out.print("Lütfen 2. sayıyı giriniz:");
        n2 = input.nextDouble();
        System.out.println("Yapmak istediğiniz işlemi seciniz\n(+,-,/,*)");
         char islem ;
        islem = input.next().charAt(0) ;

        switch (islem) {
            case '+':
                System.out.print("Sonuç: " + (n1 + n2));
                break;
            case '-':
                System.out.print("Sonuç: " + (n1 - n2));
                break;
            case '/':
                if(n2 == 0) {
                    System.out.println("Bir sayı 0'a bölünemez");
                }
                System.out.print("Sonuç: " + (n1 / n2) );
                break;
            case '*':
                System.out.print("Sonuç: " + (n1 * n2));
                break;
            default:
                System.out.print("Tekrar deneyin");



        }

    }
}
