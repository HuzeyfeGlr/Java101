import java.util.Scanner;
public class Ödev24 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int n1, n2, ebob= 1;
        System.out.print("Lütfen 1. sayıyı giriniz: ");
        n1=input.nextInt();

        System.out.print("Lütfen 2. sayıyı giriniz: ");
        n2= input.nextInt();

        int i = n1;
        while(i > 1){
            if ((n1 % i == 0) && (n2 % i == 0)){
                ebob=i;
                System.out.println("Sayıların EBOB' u: " + ebob);
                break;
            }
        i--;
    }
        System.out.println("Sayıların EKOK'u: "+ ((n1*n2)/ebob));

    }
}
