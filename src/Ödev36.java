import java.util.Arrays;
import java.util.Scanner;


public class Ödev36 {
    public static void main (String[] args) {
        Scanner input= new Scanner(System.in);
        int[] list= {15,12,788,1,-1,-788,2,0} ;
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        int sayi;
        int Ekucuk=0,Ebuyuk=0;
        int min=list[0], max=list[7];

        System.out.print("Lütfen sayı giriniz: ");
        sayi=input.nextInt();

        for(int i= 0; i< list.length; i++ ){
            if(sayi< list[0]){
                System.out.println("Girilen sayıya en yakın tek yakın sayı vardır: " + list[0]);
                break;

            } else if (sayi> list[7]) {
                System.out.println("Girilen sayıya en yakın tek sayı vardır: "+ list[7]);
                break;
            } else if (sayi< list[i]) {
                Ekucuk=list[i-1];
                Ebuyuk=list[i];
                System.out.println("Girilen sayıya en küçük en yakın sayı: " + Ekucuk);
                System.out.print("Girilen sayıya en büyük en yakın sayı: " + Ebuyuk);
                break;
            }
        }
    }
}
