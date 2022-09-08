import java.util.Scanner;

public class Ödev9 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int heat;

        System.out.print("Lütfen sıcaklığı giriniz: ");
        heat= input.nextInt();

        if((heat<5) && (heat> (-10))){
            System.out.println("Kayak Yapabilirsiniz!");
        }  else if (heat>=5 && heat<10){
            System.out.println("Sinemaya Gidebilirsiniz!");
        } else if (heat>=10 && heat<=15) {
            System.out.println("Sinemaya ya da Pikniğe Gidebilirsiniz!");
        } else if (heat>=15 && heat<25) {
            System.out.println("Pikniğe Gidebilirsiniz!");
        } else if (heat>=25 && heat<40) {
            System.out.println("Yüzmeye Gidebilirsiniz!");
        } else if (heat< -10) {
            System.out.println("Ateş Yakmak İçin Odun Toplamaya Başlasan İyi Edersin \n:D");
        } else {
            System.out.println("Bulabileceğiniz En Soğuk Yere Kaçın!! \n:)");
            
        }

    }

    }
