import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
// Press Shift+F9 to start debugging your code. We have set one breakpoint
// for you, but you can always add more by pressing Ctrl+F8.

public class Main {
    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username: ");
        String usr_uusername = scan.nextLine();

        System.out.println("Enter your e-mail: ");
        String usr_email = scan.nextLine();

        System.out.println("Enter your password: ");
        String usr_paasword = scan.nextLine();

        if (usr_email.equals("m@m.lv") && usr_paasword.equals("parole123") && usr_uusername.equals("lauris123")){
            System.out.println("Sveiki " + usr_email);
        } else {
            System.out.println("Invalid credentials ");
        }
    }
}
