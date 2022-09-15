import java.util.Scanner;

public class Ödev8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double ort = 0;

        int mat, kimya, fizik, turkce, tarih, muzik, ders = 0;

        System.out.print("Lütfen Matematik notunu giriniz: ");
        mat = input.nextInt();
        if ((mat > 0) && (mat < 100)) {
            ort += mat;
            ders++;
        }else if ((mat == 0) || (mat == 100))  {
            System.out.println("Girmiş olduğunuz not ortalama hesabına alınmayacaktır!");
        }else if ((mat < 0) || ( mat > 100)) {
            System.out.println("Lütfen 0-100 arasında bir not giriniz");
        }


        System.out.print("Lütfen Kimya notunu giriniz: ");
        kimya = input.nextInt();
        if ((kimya > 0) && (kimya < 100)) {
            ort += kimya;
            ders++;
        }else if ((kimya == 0) || (kimya == 100))  {
            System.out.println("Girmiş olduğunuz not ortalama hesabına alınmayacaktır!");
        }else if ((kimya < 0) || ( kimya > 100)) {
            System.out.println("Lütfen 0-100 arasında bir not giriniz");
        }

        System.out.print("Lütfen Fizik notunu giriniz: ");
        fizik = input.nextInt();
        if ((fizik > 0) && (fizik < 100)) {
            ort += fizik;
            ders++;
        }else if ((fizik == 0) || (fizik == 100))  {
            System.out.println("Girmiş olduğunuz not ortalama hesabına alınmayacaktır!");
        }else if ((fizik < 0) || ( fizik > 100)) {
            System.out.println("Lütfen 0-100 arasında bir not giriniz");
        }

        System.out.print("Lütfen Türkçe notunu giriniz: ");
        turkce = input.nextInt();
        if ((turkce > 0) && (turkce < 100)) {
            ort += turkce;
            ders++;
        }else if ((turkce == 0) || (turkce == 100))  {
            System.out.println("Girmiş olduğunuz not ortalama hesabına alınmayacaktır!");
        }else if ((turkce < 0) || ( turkce > 100)) {
            System.out.println("Lütfen 0-100 arasında bir not giriniz");
        }

        System.out.print("Lütfen Muzik notunu giriniz: ");
        muzik = input.nextInt();
        if ((muzik > 0) && (muzik < 100)) {
            ort += muzik;
            ders++;
        }else if ((muzik == 0) || (muzik == 100))  {
            System.out.println("Girmiş olduğunuz not ortalama hesabına alınmayacaktır!");
        }else if ((muzik < 0) || ( muzik > 100)) {
            System.out.println("Lütfen 0-100 arasında bir not giriniz");
        }
        double avarage= ort/ders;

        if (ort <= 55) {
            System.out.println("Sınıfta kaldınız,seneye tekrar görüşürüz!");
        } else {
            System.out.println("Tebrikler sınıfı geçtiniz");
        }
        System.out.print("Ortalamanız:" + avarage);

    }

    }