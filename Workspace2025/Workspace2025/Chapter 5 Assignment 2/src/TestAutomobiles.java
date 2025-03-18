
	public class TestAutomobiles {
	    public static void main(String[] args) {

	    	Automobile car1 = new Automobile(1234, "Toyota", "Camry", "Blue", 2010, 30);
	        Automobile car2 = new Automobile(-1, "Honda", "Accord", "Red", 2006, 25);
	        Automobile car3 = new Automobile(9999, "Ford", "Mustang", "Black", 2018, 15);
	        Automobile car4 = new Automobile(10000, "Chevrolet", "Impala", "White", 2020, 70);

	        System.out.println(car1);
	        System.out.println(car2);
	        System.out.println(car3);
	        System.out.println(car4);
	        
	        car1.setId(5000);
	        car1.setYear(2015);
	        car1.setMilesPerGallon(35);
	        
	        System.out.println("After updating car1:");
	        System.out.println(car1);
	    }
	}
