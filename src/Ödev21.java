import java.util.Scanner;
public class Ödev21 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n;
        double total= 0;
        n= input.nextInt();
        for(int i=1; i<=n; i++){
            total+= (1.0/i);
        }
        System.out.println(total);
    }
}
