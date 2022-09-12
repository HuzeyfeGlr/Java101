import java.util.Scanner;
public class Ödev17 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int n;

        System.out.println("Lütfen sınır sayısını belirleyin: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i*=5 ){
            System.out.println( i );
        }
        for (int i = 1; i <= n; i*=4 ){
            System.out.println( i );
        }

    }
}
