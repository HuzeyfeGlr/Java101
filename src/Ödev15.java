import java.util.Scanner;
public class Ödev15 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int sayi, i = 0 , adet = 0, toplam = 0;
        double ortalama;

        System.out.print("Lütfen sayı giriniz: ");
        sayi= input.nextInt();

        while(i<=sayi){
            i++;
            if(i == 0) {
                continue;
            }
            else if (i % 12 == 0 ) {
                toplam +=i ;
                adet ++;
            }


        }
        ortalama = toplam / adet;
        System.out.println(ortalama);

    }
}
