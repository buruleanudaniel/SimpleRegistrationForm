import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RegistrationService {
    private List<User> users = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public RegistrationService(List<User> users){
        this.users = users;
    }

    public void registerUser() {
        System.out.print("Enter the username: ");
        String username = scanner.nextLine().trim();

        // Validate username
        if (username.isEmpty()) {
            System.out.println("Username cannot be empty.");
            return;
        }

        // Check if username already exists
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                System.out.println("Username already exists. Please choose another.");
                return;
            }
        }

        System.out.print("Enter the password: ");
        String password = scanner.nextLine().trim();

        // Validate password
        if (password.isEmpty() || password.length() < 8) {
            System.out.println("Password must be at least 8 characters long.");
            return;
        }

        // Create new user and add to list
        users.add(new User(username, password));
        System.out.println("Registration successful!");
    }
}
