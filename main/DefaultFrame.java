import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class DefaultFrame extends JFrame {
    public DefaultFrame () {
        this.setTitle("Digital Calendar");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);   // user can't minimize or maximize.
        this.setSize(500, 400);
        this.setLayout(null);
        this.setVisible(true);

        ImageIcon image = new ImageIcon("logo.png");
        this.setIconImage(image.getImage());
        this.getContentPane().setBackground(new Color(0xD3D3D3));
    }
}
