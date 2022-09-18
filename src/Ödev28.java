import java.util.Scanner;
public class Ödev28 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int n= input.nextInt();
        boolean isPrime;

        for (int sayi=2; sayi<=n;sayi++){
            isPrime=true;

            for(int i=2; i<sayi; i++){
                if(sayi % i== 0){
                    isPrime=false;
                }
            }
            if(isPrime){
                System.out.print(sayi + "-");
            }
        }

    }
}
