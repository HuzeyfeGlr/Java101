import java.util.Scanner;
public class Ödev10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;

        System.out.println("Lütfen 'a' sayısını giriniz: ");
        a = input.nextInt();

        System.out.println("Lütfen 'b' sayısını giriniz: ");
        b = input.nextInt();

        System.out.println("Lütfen 'c' sayısını giriniz: ");
        c = input.nextInt();

        if ((a <b) && (a < c)) {
            if (b < c) {
                System.out.println("a < b < c");
            } else {
                System.out.println("a < c < b");
            }
        }

        if ((b < a) && (b < c)){
            if (a < c) {
                System.out.println("b < a < c");
            }else {
                System.out.println("b < c < a");
            }
        }
        if ((c < a) && (c < b)){
            if (a < b) {
                System.out.println("c < a < b");
            }else {
                System.out.println("c < b < a");
            }
        }

    }

}