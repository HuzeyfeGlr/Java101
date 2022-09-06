import java.util.Scanner;
public class Ödev3 {
    public static void main(String[] args) {
        double r , a , alan , pi=3.14 ;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen dairenin yarıçapını giriniz: ");
        r = input.nextDouble();
        System.out.print("Lütfen dairenin merkez açısının ölçüsünü giriniz: ");
        a = input.nextDouble();
        alan = (pi * (r * r) * a /360);
        System.out.print("Dairenin alanı: " + alan);




    }
}
