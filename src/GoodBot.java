import javax.swing.*;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class GoodBot {
    public static void main(String[] args) {
        String Input;
        String History = "";
        Boolean Chatting = false;

        JOptionPane.showMessageDialog(null, "Welcome to the GoodBot\nWhen you want to quit type: Stop ");

        while (!Chatting) {
            Input = JOptionPane.showInputDialog("Type your message");
            if (Objects.equals(Input, "Stop")) {
                Chatting = true;
            }
            History += Input;
            int randomNum = ThreadLocalRandom.current().nextInt(0, 10 + 1);
            if (randomNum == 10) {
                JOptionPane.showMessageDialog(null, "That's very thoughtful of you");
            } else if (randomNum == 9) {
                JOptionPane.showMessageDialog(null, "Oh, how wonderful!");
            } else if (randomNum == 8) {
                JOptionPane.showMessageDialog(null, "I would have done the same thing");
            } else if (randomNum == 7) {
                JOptionPane.showMessageDialog(null, "Wow, you are amazing");
            } else if (randomNum == 6) {
                JOptionPane.showMessageDialog(null, "How interesting");
            } else if (randomNum == 5) {
                JOptionPane.showMessageDialog(null, "Fuck you");
            } else if (randomNum == 4) {
                JOptionPane.showMessageDialog(null, "You should go love yourself NOW");
            } else if (randomNum == 3) {
                JOptionPane.showMessageDialog(null, "I wish I was there");
            } else if (randomNum == 2) {
                JOptionPane.showMessageDialog(null, "Yes");
            } else if (randomNum == 1) {
                JOptionPane.showMessageDialog(null, "No");
            } else if (randomNum == 0) {
                JOptionPane.showMessageDialog(null, "Sounds tasty");
            }

        }
        System.out.println(History);
    }
}
