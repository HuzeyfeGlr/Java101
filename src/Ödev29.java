import java.util.Scanner;
public class Ödev29 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int total = 1, b=0, a=1;
        System.out.println("Lütfen kaç eleman istediğinizi giriniz: ");
        int n= input.nextInt();


        for (int i=1 ; i<n ;i++){
            System.out.println(a + " + "+ b +" = " + total);
            b=a;
            a=total;
            total= a+b;
        }


    }
}
