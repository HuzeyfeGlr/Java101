import java.util.Scanner;
public class Ödev32 {
    static void us (){
        Scanner input= new Scanner(System.in);
        int a,i,result=1;
        boolean stop=true;
        System.out.println("Lütfen sayıyı giriniz: ");
        a= input.nextInt();
        System.out.println("Lütfen Üssü giriniz: ");
        i=input.nextInt();
        for(int k =1; k<=i ; k++){
            result*=a;
        }
        System.out.println("Sonuc= " + result);

    }
    public static void main(String[] args) {
       while (true){
           us();
       }
    }
}
