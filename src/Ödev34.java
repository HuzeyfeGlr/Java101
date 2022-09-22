import java.util.Scanner;
public class Ödev34 {
    static  int negative(int n){
        if(n <= 0){
            return n;

        }else{
            System.out.print(n + " ");
            return negative(n-5);
        }
    }
    static  int positive(int n, int i){
        if(n > i){
            return n;

        }else{
            System.out.print(n + " ");
            return positive(n+5,i);
        }
    }


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while (true) {
            System.out.println("Programı durdurmak için 0(sıfır) giriniz!!");

            System.out.println("Lütfen Sayı giriniz: ");
            int n = input.nextInt();
            positive(negative(n), n);

            if (n == 0 ){
                break;
            }
        }

    }
}
