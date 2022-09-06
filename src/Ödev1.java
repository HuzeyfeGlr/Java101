import java.util.Scanner ;
public class Ödev1 {
    public static void main(String[] args) {
        int mat,kimya,fizik,turkce,tarih,muzik ;

        Scanner input= new Scanner(System.in) ;

        System.out.print("Lütfen Matematik notunu giriniz: ");
        mat= input.nextInt();

        System.out.print("Lütfen Kimya notunu giriniz: ");
        kimya= input.nextInt();

        System.out.print("Lütfen Fİzik notunu giriniz: ");
        fizik= input.nextInt();

        System.out.print("Lütfen Türkçe notunu giriniz: ");
        turkce= input.nextInt();

        System.out.print("Lütfen Tarih notunu giriniz: ");
        tarih= input.nextInt();

        System.out.print("Lütfen Muzik notunu giriniz: ");
        muzik= input.nextInt();

        int toplam=(mat + kimya + fizik+ turkce + tarih + muzik ) ;

        double sonuc= toplam / 6 ;

        String a= ( sonuc >= 60) ? "Geçtiniz" : "Kaldnız" ;
        System.out.println("Başarı durumunuz: "+ a + " ve ortalamanız " + sonuc );






    }
}
