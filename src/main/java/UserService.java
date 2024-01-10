import java.util.Scanner;

public class UserService {

    private final Scanner scanner = new Scanner(System.in);

    public void signUp(){
        System.out.println("Plz enter your firstname: ");
        String firstname = scanner.nextLine();

        System.out.println("Plz enter your lastname: ");
        String lastname = scanner.nextLine();

        System.out.println("Plz enter your username: ");
        String username = scanner.nextLine();

        System.out.println("Plz enter your password: ");
        String password = scanner.nextLine();

        Users user = new Users(firstname, lastname, username, password);
        System.out.println(user);
    }
}
