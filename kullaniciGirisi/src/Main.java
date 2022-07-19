import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password, newpassword;
        int select;

        Scanner input = new Scanner(System.in);

        System.out.println("Username: ");
        username = input.nextLine();

        System.out.println("Password: ");
        password = input.nextLine();

        if (Objects.equals(username, "Alptug") && Objects.equals(password, "java1212")) {
            System.out.println("Giris yaptiniz!");
        } else if (Objects.equals(username, "Alptug") && !Objects.equals(password, "java1212")){
            System.out.println("Sifreniz hatali!");
            System.out.println("Sifrenizi sıfırlamak ister misiniz? \n1-YES\n2-NO ");
            select = input.nextInt();
            if (select == 1) {
                Scanner inp = new Scanner(System.in);
                System.out.println("Yeni sifrenizi giriniz: ");
                newpassword = inp.nextLine();
                if (Objects.equals(newpassword, password)) {
                    System.out.println("Sifre oluşturulamadi, lutfen baska sifre giriniz");

                } else {
                    System.out.println("Sifre oluşturuldu");
                }
            } else {
                System.out.println("OK!");
            }

        }else{
            System.out.println("Kullanıcı adı veya sifre hatali!");
        }
    }
}