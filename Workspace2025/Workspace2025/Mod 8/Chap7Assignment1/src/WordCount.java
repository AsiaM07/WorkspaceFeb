//Asia M Chap7 Assignment1 3/3/25

import java.util.Scanner;
public class WordCount{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = input.nextLine();
    int count = 0;
    for(int i = 0; i < str.length(); i++){
      if(str.charAt(i) == ' ' || str.charAt(i) == '.' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '?' || str.charAt(i) == '!' || str.charAt(i) == '-'){
        count++;
      }
    }
    System.out.println("There are " + count + " words in the string.");
  }
}
