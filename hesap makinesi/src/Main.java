import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      int n1,n2,secim;

        Scanner input= new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz :");
        n1= input.nextInt();
        System.out.println("ikinci sayıyı giriniz :");
        n2=input.nextInt();

        System.out.println("1-Toplama\n 2-Çıkarma \n 3-Çarpma\n 4-Bölme");

        System.out.println("SECİMİNİZİ YAPIN :");
        secim=input.nextInt();

        switch (secim){
            case 1:
                System.out.println("Toplam :"+(n1+n2));
                break;
            case 2:
                System.out.println("Toplam :"+(n1-n2));
                break;
            case 3:
                System.out.println("Toplam :" +(n1*n2));
                break;
            case 4:
                System.out.println((n2==0) ? "Sayı 0'a Bölünebilir mi ? " : " Toplam : " + (n1/n2));
                break;
            default:
                System.out.println("Hatalı giriş yaptınız, Tekrar deneyiniz!");
        }
    }
}