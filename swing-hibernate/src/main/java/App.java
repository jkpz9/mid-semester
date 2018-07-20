
import itus.course.qc2015.king.gui.LoginForm;

public class App {
    public static void main(String[] args)
    {
        LoginForm login = LoginForm.getInstance();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }
}
