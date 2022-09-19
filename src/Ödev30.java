import java.util.Scanner;

public class Ödev30 {

    static boolean isPalidrom(int sayi){
        int geciciSayi=sayi, degismisSayi= 0, sonSayi;
        while(geciciSayi != 0){
            sonSayi = geciciSayi % 10;
            degismisSayi = (degismisSayi *10) + sonSayi;
            geciciSayi /= 10;
        }
        if(sayi == degismisSayi){
            System.out.println(sayi + " Palindrom bir sayıdır!");
            return true;
        }else {
            System.out.println(sayi + " Palindrom bir sayı değildir!!");

            return false;
        }
    }
    public static void main(String[] args) {
        isPalidrom(2567);


    }
}
