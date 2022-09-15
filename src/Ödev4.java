import java.util.Scanner;
public class Ödev4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double boy , index ;
        int kilo;
        System.out.print("Lütfen boyunuzu giriniz: ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = input.nextInt();
        index = (kilo / ( boy * boy ));
        System.out.println("Vücut kitle indexsiniz  " + index +"'dir");

    }
}
