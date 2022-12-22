import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double armutKg, elmaKg, domatesKg, muzKg, patlicanKg ;
        double armut= 2.14  , elma= 3.67, domates= 1.11, muz= 0.95, patlican= 5, toplam;
        Scanner input = new Scanner(System.in);

        System.out.println("Armut kaç kilogram ?");
        armutKg = input.nextDouble();
        System.out.println("Elma kaç kilogram ?");
        elmaKg = input.nextDouble();
        System.out.println("Domates kaç kilogram ?");
        domatesKg = input.nextDouble();
        System.out.println("Muz kaç kilogram ? ");
        muzKg = input.nextDouble();
        System.out.println("Patlıcan kaç kilogram ? ");
        patlicanKg = input.nextDouble();

        toplam = (armut*armutKg)+(elma*elmaKg)+(domates*domatesKg)+(muz*muzKg)+(patlican*patlicanKg);
        System.out.println("Toplam Ücret : " + toplam);
    }
}