import java.util.Scanner;

public class Ödev16 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int sayi, toplam= 0;

        do {
            System.out.println("Lütfen sayı giriniz: ");
            sayi= input.nextInt();
            if (sayi % 4 == 0 && sayi % 2 == 0){
                toplam +=sayi;
            }
        }while(sayi>0);

        System.out.println("Toplam: " + toplam);

    }
}
