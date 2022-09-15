import java.util.Scanner;
public class diküçgen {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b;
        double c;
        System.out.print("Lütfen üçgenin 1. kenarını giriniz: ");
        a = input.nextInt();
        System.out.print("Lütfen üçgenin 2. kenarını giriniz: ");
        b = input.nextInt();
        c = Math.sqrt((a * a) + ( b * b));
        System.out.print("Üçgenin hipotenüsü= " + c);


    }
}
