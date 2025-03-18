//Asia McDonald Midterm  Coding Exercise 3/6/25//

public class TestAutomobile {

	public static void main(String[] args) {
		
		 Automobile one = new Automobile(1, "Ford", "Mustang", "red", 2018, 45.5);
	        Automobile two = new Automobile(-2, "Ford", "Mustang", "red", 2018, 45.5);
	        Automobile three = new Automobile(3, "Ford", "Mustang", "red", 2000, 45.5);
	        Automobile four = new Automobile(5, "Ford", "Mustang", "red", 2018, 70);
	        
	        displayAutomobile("Automobile One", one);
	        displayAutomobile("Automobile Two", two);
	        displayAutomobile("Automobile Three", three);
	        displayAutomobile("Automobile Four", four);
	    }
	    
	    public static void displayAutomobile(String label, Automobile auto) {
	        System.out.println(label + ":");
	        System.out.println("ID: " + auto.getId());
	        System.out.println("Make: " + auto.getMake());
	        System.out.println("Model: " + auto.getModel());
	        System.out.println("Color: " + auto.getColor());
	        System.out.println("Year: " + auto.getYear());
	        System.out.println("Miles Per Gallon: " + auto.getMilesPerGallon());
	        System.out.println();
	    }
	}

