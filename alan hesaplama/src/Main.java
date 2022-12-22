import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double pi = 3.14, r, alan , dilimAcisi, dilimAlani;
        Scanner input = new Scanner(System.in);
        System.out.println("YARI ÇAPI GİRİNİZ : ");
        r = input.nextDouble();
        alan = pi* r * r;
        System.out.println("DAİRENİN AÇISINI GİRİNİZ : ");
        dilimAcisi =  input.nextDouble();
        dilimAlani= (alan*dilimAcisi)/360;

        System.out.println("Dairenin Dilim Alanı : " + dilimAlani);
        System.out.println("Daire Alanı :" + alan);

    }
}