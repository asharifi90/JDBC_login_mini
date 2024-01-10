import java.util.Scanner;

public class Menu {

    private final Scanner scanner = new Scanner(System.in);
    public void publicMenu(){
        System.out.println("*****WELLCOME*****");
        System.out.println("1 -> Sign-up");
        System.out.println("2 -> Sign-in");
        System.out.println("3 -> Exit");
        System.out.println("Choose your number");

        int number = scanner.nextInt();
        scanner.nextLine();

        switch (number){
            case 1 -> signUp();
            case 2 -> System.out.println("signUp");
            case 3 -> System.out.println("exit");
        }
    }

    public void signUp(){
        UserService userService = new UserService();
        userService.signUp();
    }

}
