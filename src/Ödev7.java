import java.util.Scanner;
public class Ödev7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String id, pw;

        System.out.print("Kullanıcı Adı:");
        id = input.nextLine();

        System.out.print("Şifre:");
        pw = input.nextLine();

        if (id.equals("patika") && pw.equals("java123")) {
            System.out.print("Hoşgeliniz");

        }else if (!id.equals("patika")) {
            System.out.println("Kullanıcı Adınız yanlış!");

        } else {
            System.out.println("Hatalı giriş yaptınız!\nYeni şifre oluşturmak ister misiniz?\nEVET 'e'\nHayır 'h'");
            String ch = input.nextLine();

            if (ch.equals("h")) {
                System.out.print("Şifre değiştirilmedi!");

            } else if (ch.equals("e")) {
                System.out.print("Yeni şifrenizi giriniz:");
                String yeni = input.nextLine();

                if (yeni.equals("java123")) {
                    System.out.print("Yeni şifreniz,eski şifreniz ile aynı olamaz");
                } else {
                    pw = yeni;
                    System.out.print("Şifre değiştirildi!");
                }

            } else {
                System.out.print("Hatalı giriş");


            }
        }
    }
}