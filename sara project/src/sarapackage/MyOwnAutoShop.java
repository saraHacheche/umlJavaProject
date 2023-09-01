package sarapackage;

public class MyOwnAutoShop {
	 public static void main(String[] args) {
	        Sedan sedan = new Sedan();
	        sedan.speed = 100;
	        sedan.regularPrice = 20000;
	        sedan.color = "Red";
	        sedan.length = 25;

	        Truck truck1 = new Truck();
	        truck1.speed = 80;
	        truck1.regularPrice = 30000;
	        truck1.color = "Blue";
	        truck1.setWeight(2500);

	        Truck truck2 = new Truck();
	        truck2.speed = 90;
	        truck2.regularPrice = 40000;
	        truck2.color = "Green";
	        truck2.setWeight(2500);

	        Car car = new Car();
	        car.speed = 120;
	        car.regularPrice = 15000;
	        car.color = "Black";

	        System.out.println("Sale price of Sedan: $" + sedan.getSalePrice ());
	        System.out.println("Sale price of Truck 1: $" + truck1.getSalePrice());
	        System.out.println("Sale price of Truck 2: $" + truck2.getSalePrice());
	        System.out.println("Sale price of Car: $" + car.getSalePrice()); 
	    }
	
		




	}


