import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;

        Scanner inp = new Scanner(System.in);
        System.out.print("kullanıcı adınız :");
        userName = inp.nextLine();
        System.out.print("sifre giriniz");
        password = inp.nextLine();


        if (userName.equals("emredrmz05") && password.equals("12345")) {
            System.out.println("giris yaptınız");

        } else {
            System.out.println("hatalı giris");
        }
    }
}