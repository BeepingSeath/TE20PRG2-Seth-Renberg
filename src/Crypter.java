import javax.swing.*;

public class Crypter {
    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Input a number"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Input a key"));
        System.out.println(Encrypt(x,y));

    }
    static int Encrypt(int x,int y){
        int z = x^y;
        return z;
    }
}
