import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int a,b;
        double c;

        //kullanıcıdan veri alma
        Scanner girdi=new Scanner(System.in);
        System.out.println("A kenarını giriniz");
        a=girdi.nextInt();
        System.out.println("B kenarını giriniz");
        b=girdi.nextInt();

        c=Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenus: "+c);
    }
}