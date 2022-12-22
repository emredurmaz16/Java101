import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double kmBasi, indiBindi, acilis, gidilenYol,ucret;
        Scanner inp = new Scanner(System.in);

        System.out.println("İndi Bindi Ücretimiz 20TL'dir.");

        System.out.print("Lütfen KM Giriniz = ");
        gidilenYol = inp.nextDouble();

        kmBasi = 2.20 ;
        indiBindi = 20 ;
        acilis = 10 ;
        ucret = (kmBasi * gidilenYol) + acilis;
        ucret = ucret < indiBindi ? 20 : ucret;
        System.out.println("Kilometre Başı Ücret = " +kmBasi);
        System.out.println("Açılış Ücreti = " +acilis);
        System.out.print("Ücretiniz = " + ucret);



        /*
         * Kilometre başına 2,20tl
         * İNDİ BİNDİ 20 TL
         * AÇILIŞ ÜCRETİ 10 TL
         */

    }
}