import java.util.Scanner;

public class Ödev31 {
    static void toplama (){
        Scanner input= new Scanner(System.in);
        int a,i =1, result=0;
        System.out.println("Toplama işlemini bitirmek için 0(sıfır) değerini giriniz!!");
        while (true){
            System.out.print((i++) + ".sayı: ");
            a=input.nextInt();
            if(a== 0){
                break;
            }
            result+=a;
        }
        System.out.println("Sonuç " +result);
    }
    static void cıkarma (){
        Scanner input= new Scanner(System.in);
        System.out.print("1.Sayıyı girin:");
        int a=input.nextInt();
        System.out.println("İlk Sayıdan kaç adet sayı çıkartıcaksınız?");
        int adet= input.nextInt();
        int b,i =1, result=0;
        for(int k=1; k<= adet; k++){
            System.out.print(k + ". sayı: ");
            b=input.nextInt();
            result+=b;
        }
        a-=result;
        System.out.println("Sonuç= " +result);

    }
    static void bolme (){
        Scanner input= new Scanner(System.in);
        int a,i, result=0;
        System.out.println("Lütfen Sayıyı Giriniz: ");
        a= input.nextInt();

        System.out.println("Lütfen Bölen Sayıyı Giriniz: ");
        i= input.nextInt();
        if(i == 0){
            System.out.println("Sonuç tanımsızdır lütfen başka bir işlem yapın!!!");
        }else {
            result = a / i;
            System.out.println("Sonuç= " + result);
        }
    }
    static void carpma (){
        Scanner input= new Scanner(System.in);
        int a,i =1, result=1;
        System.out.println("Carpma işlemini bitirmek için 0(sıfır) değerini giriniz!!");
        while (true){
            System.out.print((i++) + ".sayı: ");
            a=input.nextInt();
            if(a== 0){
                break;
            }
            result*=a;
        }
        System.out.println("Sonuç= " + result);
    }
    static void kalan (){
        Scanner input= new Scanner(System.in);
        int a,i, result=0;
        System.out.println("Lütfen Sayıyı Giriniz: ");
        a= input.nextInt();

        System.out.println("Lütfen Bölen Sayıyı Giriniz: ");
        i= input.nextInt();
        if(i == 0){
            System.out.println("Sonuç tanımsızdır lütfen başka bir işlem yapın!!!");
        }else {
            result = a % i;
            System.out.println("Kalan=  " + result);
        }
    }
    static void dortgen (){
        Scanner input= new Scanner(System.in);
        int a,i;
        System.out.println("Lütfen 1.kenarı Giriniz: ");
        a= input.nextInt();

        System.out.println("Lütfen 2.kenarı Giriniz: ");
        i= input.nextInt();
        if(i ==0  || a== 0 ){
            System.out.println("Sonuç tanımsızdır lütfen başka bir işlem yapın!!!");
        }else {
            System.out.println("Alan=  " + (a* i) + "Çevre= " + (2 * (a + i )));
        }
    }
    static void us (){
        Scanner input= new Scanner(System.in);
        int a,i,result=1;
        System.out.println("Lütfen sayıyı giriniz: ");
        a= input.nextInt();
        System.out.println("Lütfen Üssü giriniz: ");
        i=input.nextInt();
        for(int k =1; k<=i ; k++){
            result*=a;
        }
        System.out.println("Sonuc= " + result);
    }
    static void fak(){
        Scanner input= new Scanner(System.in);
        int a,result=1;
        System.out.println("Lütfen Sayıyı Giriniz: ");
        a= input.nextInt();
        for (int i = 1; i <= a; i++){
            result=result*i;
        }if (a == 0 ){
            System.out.println("Sonuc "+ a + "! = 0");
        }else {
        System.out.println("Sonuc "+ a + "! = " + result);
        }
    }





    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int secim;
        String menu =
                "1-Toplama\n" +
                "2-Çıkarma\n" +
                "3-Bölme\n" +
                "4-Çarpma\n" +
                "5-Bölümden Kalanı bulma\n" +
                "6-Dikdörtgen Alanı bulma\n" +
                "7-Üs bulma\n" +
                "8-Faktöriyel hesabı\n" +
                "Lütfen Yapmak İstediğiniz işlemi giriniz\n";

        while(true){
            System.out.println(menu);
            secim=input.nextInt();

            switch (secim){
                case 1:
                    toplama();
                    break;
                case 2:
                    cıkarma();
                    break;
                case 3:
                    bolme();
                    break;
                case 4:
                    carpma();
                    break;
                case 5:
                    kalan();
                    break;
                case 6:
                    dortgen();
                    break;
                case 7:
                    us();
                    break;
                case 8:
                    fak();
                    break;

            }
            System.out.println("-----------------------------------");


        }

    }
}
