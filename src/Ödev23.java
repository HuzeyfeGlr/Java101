import java.util.Scanner;

public class Ödev23 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String id, pasword;
        int right=3 , balance= 1500;

        while (right > 0){
            System.out.print("Kullanıcı adınız: ");
            id= input.nextLine();
            System.out.print("Şifreniz: ");
            pasword= input.nextLine();
            if (id.equals("patika") && pasword.equals("dev123")){
                System.out.println("Bankamıza hoşgeldiniz!");

                int chosen = 1;
                while (chosen != 4) {

                System.out.println("1-Para Yatırma" +
                        "\n2-Para Çekme" +
                        "\n3-Bakiye Sorgulama" +
                        "\n4-Çıkış Yap");
                    chosen = input.nextInt();

                    switch (chosen) {
                        case 1:
                            System.out.println("Lütfen Yatırmak İstediğiniz Tutarı Giriniz");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.println("Lütfen Çekmek İstediğiniz Tutarı Giriniz");
                            int price2 = input.nextInt();
                            if (price2 > balance) {
                                System.out.println("Yetersiz bakiye");
                            }else {
                                balance -= price2;
                            }
                            break;


                        case 3:
                            System.out.print("Bakiyeniz: " + balance);
                            break;


                        case 4:
                            System.out.println("Tekrar Bekleriz :)");
                            break;

                    }
                }
            }else {
                right--;
                System.out.println("Hatalı Giriş Yaptınız.Tekrar Deneyin!");
                if (right== 0 ){
                    System.out.println("Hesabınız Bloke Oldu.Lütfen Banka ile İletişime Geçiniz...");
                }else{
                    System.out.println("Kalan Hakkınız: " + right);
                }

            }
        }

    }
}
