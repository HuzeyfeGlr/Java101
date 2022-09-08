import java.util.Scanner;

public class Ödev13 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        int a=0,b=1,c=2,d=3,e=4,f=5,g=6,h=7,j=8,k=9,l=10,x=11,y=12,yil;
        String burc = "";
        System.out.println("Lütfen doğum yılınızı giriniz: ");
        yil= input.nextInt();
        if (yil % 12 == 0){
            burc="Maymun";
        }else if (yil % 12 == 1){
            burc="Horoz";
        }else if (yil % 12 == 2){
            burc="Köpek";
        }else if (yil % 12 == 3){
            burc="Domuz";
        }else if (yil % 12 == 4){
            burc="Fare";
        }else if (yil % 12 == 5){
            burc="Öküz";
        }else if (yil % 12 == 6){
            burc="Kaplan";
        }else if (yil % 12 == 7){
            burc="Tavşan";
        }else if (yil % 12 == 8){
            burc="Ejderha";
        }else if (yil % 12 == 9){
            burc="Yılan";
        }else if (yil % 12 == 10){
            burc="At";
        }else if (yil % 12 == 11){
            burc="Koyun";
        }
        System.out.println("Çin Zodyağı burcunuz " + burc);

    }
}
