//Asia M Chap1 Web Assist Assignment1 2/5

import javax.swing.JOptionPane;
public class RandomGuess{
  public static void main(String[] args){
    String input = JOptionPane.showInputDialog("Think of a number between 1 and 10.");
    int num = Integer.parseInt(input);
    int random = (1 + (int)(Math.random() * 10));
    JOptionPane.showMessageDialog(null, "The number is " + random);
    if (num == random){
      JOptionPane.showMessageDialog(null, "Your guess was correct.");
    }
    else{
      JOptionPane.showMessageDialog(null, "Your guess was incorrect.");
    }
  }  
} 
