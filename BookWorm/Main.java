
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to BOOKWORM\n");
            System.out.println("1.Librarian Login\n2.User Registration\n3.User login\n4.Exit");

            int choice;
            choice = sc.nextInt();
            if (choice == 1) {
                Librarian lb = new Librarian();
                lb.login();
            }
            else if (choice == 2) {
                User u = new User();
                u.registration();
            }
            else if(choice == 3){
                User u = new User();
                u.login();
            }
            else if(choice==4) break;
        }
        sc.close();
    }
}
