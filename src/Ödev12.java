import java.util.Scanner;

public class Ödev12 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int km,yas,yolTipi;
        double yasİndOran=1,yolİnOran = 0,normalTutar, katsayi = 0.10,indirimliTutar,yasİndirimi,gdİndirimi,total;
        String secim;

        System.out.println("Lütfen yolculuk tipini seçiniz\nTek yön için '1'\nGidiş-Dönüş için '2' yi");
        secim= input.nextLine();

        System.out.println("Lütfen gideceğiniz mesafeyi giriniz: ");
        km= input.nextInt();
        if (km<0){
            System.out.println("Hatalı veri girdiniz.Lütfen tekrar deneyin.");
        }else {

            System.out.println("Lütfen yaşınızı giriniz: ");
            yas = input.nextInt();

            if (secim.equals("1")) {
                yolİnOran = 0;
            } else if (secim.equals("2")) {
                yolİnOran = 0.20;
            } else {
                System.out.println("Hatalı seçim.Lütfen tekrar deneyiniz!");
            }

            if (yas >= 63) {
                yasİndOran = 0.30;
            } else if ((24 >= yas) && (yas >= 12)) {
                yasİndOran = 0.10;
            } else if (yas < 12) {
                yasİndOran = 0.50;
            } else {
                yasİndOran = 0;
            }
            if (yolİnOran == 0.20) {
                normalTutar = km * katsayi;
                yasİndirimi = normalTutar * yasİndOran;
                indirimliTutar = normalTutar - yasİndirimi;
                gdİndirimi = indirimliTutar * yolİnOran;
                total = (indirimliTutar - gdİndirimi) * 2;
                System.out.println(total);
            } else if (yolİnOran == 0) {
                normalTutar = km * katsayi;
                yasİndirimi = normalTutar * yasİndOran;
                indirimliTutar = normalTutar - yasİndirimi;
                gdİndirimi = indirimliTutar * yolİnOran;
                total = (indirimliTutar - gdİndirimi);
                System.out.println(total);

            }
        }

    }
}
