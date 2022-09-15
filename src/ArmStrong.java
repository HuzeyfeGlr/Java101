import java.util.Scanner;
public class ArmStrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number = input.nextInt();
        int basamakSayisi = 0;
        int sayi = number;
        int basamak;
        int result = 0;
        int basamakKuvveti;

        while (sayi != 0) {
            sayi /= 10;
            basamakSayisi++;
        }

        sayi = number;
        while (sayi != 0) {
            basamak = sayi % 10;
            basamakKuvveti = 1;
            for (int i = 1; i <= basamakSayisi; i++) {
                basamakKuvveti *= basamak;
            }
            result += basamakKuvveti;
            sayi /= 10;
        }

        if (result == number) {
            System.out.println(number + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(number + " sayısı bir Armstrong sayısı değildir.");
        }



    }
}
