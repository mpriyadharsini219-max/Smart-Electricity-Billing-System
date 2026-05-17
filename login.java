public class Login {

    String username = "admin";
    String password = "admin123";

    public boolean validate(String user, String pass) {
        return user.equals(username) && pass.equals(password);
    }
}
