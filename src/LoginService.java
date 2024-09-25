import java.util.Scanner;
import java.util.List;

public class LoginService {
    private List<User> users;

    public LoginService(List<User> users) {
        this.users = users;
    }

    public void loginUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine().trim();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                System.out.println("Successfully logged in!");
                return;
            }
        }

        System.out.println("Invalid username or password.");
    }
}
