import java.util.Scanner;
public class Ödev26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, mukemmel = 1;
        System.out.print("Lütfen  sayı giriniz: ");
        n = input.nextInt();

        int i = n-1;
        while (i > 1) {
            if ((n % i == 0)) {
                mukemmel += i;
            }
            i--;
            if (n == mukemmel) {
                System.out.println(mukemmel);

            }

        }
    }
}
