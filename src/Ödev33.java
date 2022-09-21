import java.util.Scanner;

public class Ödev33 {
    static boolean checkPrime(int number,int index){

        if(number % index==0){
            return false;
        }
        else if(index*index>number){
            return true;
        }
        return checkPrime(number,index+1);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(true){
            System.out.print("Sayı giriniz: ");
            int number=input.nextInt();
            if(checkPrime(number,2)){
                System.out.println(number+" sayısı asaldır!");
                System.out.println("----------------------------------");
            }else{
                System.out.println(number+" sayısı  asal değildir!");
                System.out.println("----------------------------------");
            }
        }
    }
}
