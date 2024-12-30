import javax.swing.*;

public class MainFrame extends JFrame {
    public void initialise (User user) {
        setTitle("LoginForm");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(1100, 650);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
