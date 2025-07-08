import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class StartingWindow extends JFrame implements ActionListener {
    private static final int BUTTON_WIDTH = 120;
    private static final int BUTTON_HEIGHT = 40;
    private static final int BUTTON_X = 180;
    private static final int START_Y = 100;
    private static final int GAP = 50;

    JButton loginButton;
    JButton signUpButton;
    JButton exitButton;

    public StartingWindow () {
        // Frame.
        this.setTitle("Digital Calendar");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);   
        this.setSize(500, 400);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(0xD3D3D3));
        this.setIconImage(new ImageIcon("logo.png").getImage());

        // Label.
        JLabel label = new JLabel("Digital Calendar");
        label.setForeground(new Color(0x36454F));
        label.setFont(new Font("SansSerif", Font.BOLD, 24));
        label.setBounds(150, 30, 250, 50);
        this.add(label);

        // Buttons.
        loginButton = createButton("Login", START_Y);
        signUpButton = createButton("Sign Up", START_Y + GAP);
        exitButton = createButton("Exit", START_Y + (GAP * 2));
        this.add(loginButton);
        this.add(signUpButton);
        this.add(exitButton);

        this.setVisible(true);
    }

    private JButton createButton(String text, int y) {
        JButton button = new JButton(text);
        button.setBounds(BUTTON_X, y, BUTTON_WIDTH, BUTTON_HEIGHT);
        button.setFocusable(false);
        button.setBorder(BorderFactory.createEtchedBorder());
        button.addActionListener(this);
        return button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            System.out.println("Entering the login page.");
            this.setVisible(false);
            new LoginWindow(this);
        } else if (e.getSource() == signUpButton) {
            System.out.println("Entering the sign up page.");
            this.setVisible(false);
            new SignUpWindow(this);
        } else if (e.getSource() == exitButton) {
            System.out.println("Exiting the program.");
        }
    }
}
