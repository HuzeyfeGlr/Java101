import java.util.Scanner ;

public class kdvprogram {
    public static void main(String[] args) {
      int giren,KDV ;

      Scanner input= new Scanner(System.in);
        System.out.print("Lütfen girilen tutarı yazınız: ");

        giren = input.nextInt();
        KDV= ( giren >= 1000 ) ? (giren * 8 /100) : (giren * 18 / 100);

        System.out.println("Girilen tutarın KDV'si: " + KDV + " \nKDV'li fiyatı ise:" + (giren+KDV));


    }
}
