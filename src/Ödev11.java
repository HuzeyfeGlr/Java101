import java.util.Scanner;

public class Ödev11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String burc = "";

        boolean isError = false;

        int ay, gün;
        System.out.println("Lütfen doğduğunuz ayı yazın: ");
        ay = input.nextInt();

        System.out.println("Lütfen doğduğunuz günü yazın: ");
        gün = input.nextInt();

        if ((ay > 12) || (ay < 1)) {
            isError = true;
        } else {

            if (ay == 3) {
                if ((gün >= 21) && (gün <= 31)) {
                    burc = "Koç";
                } else if (gün > 31) {
                    isError = true;
                } else {
                    burc = "Balık";
                }
            }
            if (ay == 4) {
                if ((gün >= 21) && (gün <= 30)) {
                    burc = "Boğa";
                } else if (gün > 30) {
                    isError = true;
                } else {
                    burc = "Koç";
                }
            }
            if (ay == 5) {
                if ((gün >= 22) && (gün <= 31)) {
                    burc = "İkizler";
                } else if (gün > 31) {
                    isError = true;
                } else {
                    burc = "Boğa";
                }
            }
            if (ay == 6) {
                if ((gün >= 23) && (gün <= 30)) {
                    burc = "Yengeç";
                } else if (gün > 30) {
                    isError = true;
                } else {
                    burc = "İkizler";
                }
            }
            if (ay == 7) {
                if ((gün >= 23) && (gün <= 31)) {
                    burc = "Aslan";
                } else if (gün > 31) {
                    isError = true;
                } else {
                    burc = "Yengeç";
                }
            }
            if (ay == 8) {
                if ((gün >= 23) && (gün <= 30)) {
                    burc = "Başak";
                } else if (gün > 30) {
                    isError = true;
                } else {
                    burc = "Aslan";
                }
            }
            if (ay == 9) {
                if ((gün >= 23) && (gün <= 31)) {
                    burc = "Terazi";
                } else if (gün > 31) {
                    isError = true;
                } else {
                    burc = "Başak";
                }
            }
            if (ay == 10) {
                if ((gün >= 23) && (gün <= 30)) {
                    burc = "Akrep";
                } else if (gün > 30) {
                    isError = true;
                } else {
                    burc = "Terazi";
                }
            }
            if (ay == 11) {
                if ((gün >= 22) && (gün <= 31)) {
                    burc = "Yay";
                } else if (gün > 31) {
                    isError = true;
                } else {
                    burc = "Akrep";
                }
            }
            if (ay == 12) {
                if ((gün >= 22) && (gün <= 30)) {
                    burc = "Oğlak";
                } else if (gün > 30) {
                    isError = true;
                } else {
                    burc = "Yay";
                }
            }
            if (ay == 1) {
                if ((gün >= 22) && (gün <= 31)) {
                    burc = "Kova";
                } else if (gün > 31) {
                    isError = true;
                } else {
                    burc = "Oğlak";
                }
            }
            if (ay == 2) {
                if ((gün >= 20 && (gün <= 28))) {
                    burc = "Balık";
                } else if (gün > 28) {
                    isError = true;
                } else {
                    burc = "Kova";
                }
            }
        }
        if (isError) {
            System.out.println("Hatalı giriş yaptınız.Lütfen tekrar deneyiniz...");
        } else {
            System.out.println("Burcunuz: " + burc);

        }
    }
}
