//Asia M Chap1Assignment1 2/4

public class Triangle {

	public static void main(String[] args) {	
		int rows = 7;
		  for (int i = 0; i < rows; i++) {
		  for (int j = 0; j < rows - i; j++) {
		  System.out.print(" ");
		  }
		  for (int k = 0; k <= 2 * i; k++) {
		  System.out.print("T");
		  }
		  System.out.println();
	}

}
}