import java.util.Scanner;
public class Ödev18 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int n ,nTotal =1, r, rTotal=1,nrTotal=1 ;
        System.out.println("Lütfen eleman sayısını giriniz: ");
        n = input.nextInt();
        System.out.println("Lütfen grup sayısını giriniz: ");
        r= input.nextInt();
        if (r >= n){
            System.out.println("Hatalı seçim.Tekrar deneyin!");
        }


        for (int i = 1 ; i <= n ; i++){
            nTotal= nTotal * i;
        }
        for (int j = 1 ; j <=r  ; j++){
            rTotal= rTotal * j;
        }
        for (int k = 1 ; k <=(n - r)  ; k++){
            nrTotal= nrTotal * k;
        }
        System.out.println("C(n,r)= " + (nTotal/(rTotal * nrTotal)));

    }
}
