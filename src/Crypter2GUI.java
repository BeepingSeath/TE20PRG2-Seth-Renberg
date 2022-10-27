import javax.swing.*;

public class Crypter2GUI {
    private JPanel panel1;
    private JTextField textField1;
    private JScrollBar scrollBar1;
    private JProgressBar progressBar1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Crypter2GUI");
        frame.setContentPane(new Crypter2GUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
