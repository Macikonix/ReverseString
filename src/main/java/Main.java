import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String title = "Reverse String";

        String input = JOptionPane.showInputDialog(null, "Write word to reverse:", title, JOptionPane.INFORMATION_MESSAGE);

        StringBuilder buildReverseString = new StringBuilder();

        for(int i = 0; i < input.length(); i++) {

            char charToInsret = input.charAt(input.length()-1-i);
            buildReverseString.insert(i, charToInsret);
        }

        String reverseString = buildReverseString.toString();

        JOptionPane.showMessageDialog(null, "Reversed word: " + reverseString, title, JOptionPane.INFORMATION_MESSAGE);
    }
}
