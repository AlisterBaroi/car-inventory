// this is first subclass of Cars superclass
public class familyCars extends Cars {
    private double freeService; // <= first encapsulated attribute of subclass
    private int carMileage; // <= second encapsulated attribute of subclass

    public familyCars(String a, double b) { // <= Polymorphism method overloading
        super(a, b);
        carMileage = 230;
        freeService = 2000;
    }

    public familyCars(String a, double b, int e, double f) { // <= Polymorphism method overloading
        super(a, b);
        carMileage = e;
        freeService = f;
    }

    public int getMileage() { // <= this is Encapsulation
        return carMileage;
    }

    public void setFreeService(double g) { // <= this is to Encapsulate
        freeService = g;
    }

    public double getFreeService() { // <= this is Encapsulation
        return freeService;
    }

    public void printDetails() {
        System.out.println("\n******** FAMILY CAR ********");
        super.printDetails();
        System.out.println("Mileage:            " + carMileage + " km/gal");
        System.out.println("Free Service:       $" + freeService);
    }
}
