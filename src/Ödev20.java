import java.util.Scanner;
public class Ödev20 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int sayi ,basamak,toplam= 0, basamakSayisi= 0;

        sayi=input.nextInt();

        int number = sayi;

        while (number != 0) {
            number /= 10;
            basamakSayisi++;
        }
        number= sayi;
        while( basamakSayisi != 0){
            basamak = number % 10;
            toplam += basamak;
            basamakSayisi--;
            number/=10;

        }
        System.out.println(toplam);


    }
}
