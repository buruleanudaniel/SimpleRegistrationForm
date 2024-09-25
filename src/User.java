public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // getter
    public String getUsername()
    {
        return username;
    }

    public String getPassword()
    {
        return password;
    }

    // setter

    public void setUsername(String newUser)
    {
        this.username = newUser;
    }

    public void setPassword(String newPassword)
    {
        this.password = newPassword;
    }
}