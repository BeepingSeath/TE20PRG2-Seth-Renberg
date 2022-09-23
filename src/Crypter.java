import javax.swing.*;

public class Crypter {
    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Input a String"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Input a key"));
        char c = (char)Encrypt(x,y);
        System.out.println(c);

    }
    static int Encrypt(int x,int y){
        int z = x^y;
        return z;
    }
}