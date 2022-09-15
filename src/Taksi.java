import java.util.Scanner;

public class Taksi {
    public static void main(String[] args) {
        double km , total , perKm = 2.20, acilis = 10 ;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen gidilen yol mesafesini giriniz: ");
        km = input.nextDouble();
        total = (acilis + (km * perKm));
        total = (total <= 20) ? ( 20 ) : (total) ;
        System.out.print("Ödenmesi gerenken ücret: " + total);


    }
}
