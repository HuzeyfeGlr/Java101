import java.util.Scanner;

public class Ödev25 {
    public static void main(String[] args) {
        int sayilar,sayi,max = 0,min =0;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayıyı karşılaştırmak istersiniz : ");
        sayilar = input.nextInt();

        for (int i=1;i <= sayilar;i++){
            System.out.print(i+ ". sayıyı giriniz : ");
            sayi = input.nextInt();
            if (i == 1){
                max = sayi;
                min = sayi;
            } else {
                if (sayi > max){
                    max = sayi;
                }
                if (sayi < min){
                    min = sayi;
                }
            }
        }
        System.out.print("En küçük sayı : "+min+"\n");
        System.out.print("En büyük sayı : "+max);
    }
}
