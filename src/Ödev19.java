import java.util.Scanner;
public class Ödev19 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int sayi,us,total=1;
        System.out.println("Lütfen sayı giriniz");
        sayi= input.nextInt();

        System.out.println("Lütfen üssü giriniz");
        us= input.nextInt();

        for(int i = 1; i <= us; i++){

            total*=sayi;
        }
        System.out.println(total);

    }
}
