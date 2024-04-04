import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MemGame extends JFrame {
    private JPanel mainPanel;
    private JLabel Header;
    private JButton QUITButton;
    private JButton PLAYButton;
    private JButton HIGHSCOREButton;


    public MemGame() {
        PLAYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(PLAYButton,"CLICK");
            }
        });
        QUITButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(QUITButton,"QUIT");
            }
        });
    }

    public static void main(String[] args) {
        MemGame menu = new MemGame();
        menu.setContentPane(menu.mainPanel);
        menu.setTitle("Memory Game");
        menu.setSize(500,500);
        menu.setVisible(true);
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}