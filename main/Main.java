import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Main {
    public static void main(String[] args) {
        // Starting Page.
        DefaultFrame frame = new DefaultFrame();
        JLabel label = new JLabel();
        label.setText("Digital Calendar");
        label.setForeground(new Color(0x36454F));
        label.setFont(new Font("SansSerif", Font.BOLD, 24));
        label.setBounds(150, -95, 250, 250);
        frame.add(label);

        ImageIcon image = new ImageIcon("logo.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(0xD3D3D3));
    }
}