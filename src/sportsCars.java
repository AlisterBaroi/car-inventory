// this is second subclass of Cars superclass
public class sportsCars extends Cars {
    private double acceleration; // <= first encapsulated attribute of subclass
    private int topSpeed; // <<= second encapsulated attribute of subclass
    private double discount; // <= third attribute

    public sportsCars(String a, double b, double e, int f, double g) {
        super(a, b);
        acceleration = e;
        topSpeed = f;
        discount = g;
    }

    public double getAcc() { // <= this is Encapsulation
        return acceleration;
    }

    public int getSpeed() { // <= this is Encapsulation
        return topSpeed;
    }

    public void setDiscount(double j) { // <= this is to Encapsulate
        discount = j;
    }

    public double getDiscount() { // <= this is Encapsulation
        return discount;
    }

    public void printDetails() {
        System.out.println("\n******** SPORT CAR ********");
        super.printDetails();
        System.out.println("Acceleration(0-60): " + acceleration + " second");
        System.out.println("Top Speed:          " + topSpeed + " km/h");
        System.out.println("Discount:           $" + discount);
    }
}
