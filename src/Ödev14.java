import java.util.Scanner;

public class Ödev14 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int yil;

        System.out.println("Lütfen bulmak istediğiniz yılı giriniz: ");
        yil= input.nextInt();

        if (yil % 4 == 0){
            System.out.println("Girmiş olduğunuz yıl artık bir yıldır!");
        }else {
            System.out.println("Girmiş olduğunuz yıl artık yıl değildir!");
        }
    }
}
