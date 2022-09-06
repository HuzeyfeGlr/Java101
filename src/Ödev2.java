import java.util.Scanner;

public class Ödev2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b,c;
        double alan,cevre,u;
        System.out.print("Lütfen üçgenin 1. kenarını giriniz: ");
        a = input.nextInt();
        System.out.print("Lütfen üçgenin 2. kenarını giriniz: ");
        b = input.nextInt();
        System.out.print("Lütfen üçgenin 3. kenarını giriniz: ");
        c = input.nextInt();
        u = ((a+b+c)/2);
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        cevre = (2 * u);
        System.out.println("Üçgenin çevresi: " + (cevre) + "\nÜçgenin alanı: " + (alan));

    }
}
