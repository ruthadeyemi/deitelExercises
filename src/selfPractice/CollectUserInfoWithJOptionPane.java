package selfPractice;
import  javax.swing.JOptionPane;
public class CollectUserInfoWithJOptionPane {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name:");
        JOptionPane.showMessageDialog(null, "Hello " +name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
        JOptionPane.showMessageDialog(null, "you are " +age+ "years old");
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height in cm:"));
        JOptionPane.showMessageDialog(null, "you are " +height+ "cm tall");
        JOptionPane.showMessageDialog(null, "Thank you for your time");


    }
}
