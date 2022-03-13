// this is the subclass of businessDiscounts superclass
public class businessCars extends businessDiscounts {
    private int seats; // <= first encapsulated attribute of subclass
    private int carMileage; // <= second encapsulated attribute of subclass

    public businessCars(String a, double b, double c, double d, int k, int l) {
        super(a, b, c, d);
        seats = k;
        carMileage = l;
    }

    public int getSeats() { // <= this is Encapsulation
        return seats;
    }

    public int getMileage() { // <= this is Encapsulation
        return carMileage;
    }

    public void printBusinessDiscounts() { // <= defining abstract method
        System.out.println("Total Discount:     $" + super.getDiscount1() + " (for 4-8 cars)");
        System.out.println("Total Discount:     $" + super.getDiscount2() + " (for 8+ cars)");
    }

    public void printDetails() {
        System.out.println("\n******** BUSINESS CAR ********");
        super.printDetails();
        System.out.println("Seats:              " + seats);
        System.out.println("Mileage:            " + carMileage + " km/gal");
        printBusinessDiscounts(); // <= calling abstract method
    }
}
