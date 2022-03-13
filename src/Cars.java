// this is the superclass
public class Cars {
    private String carModel; // <= first encapsulated attribute of superclass
    private double carPrice; // <= second encapsulated attribute of superclass

    Cars(String a, double b) {
        carModel = a;
        carPrice = b;
    }

    public String getModel() { // <= this is Encapsulation
        return carModel;
    }

    public void setCarPrice(double d) { // <= this is to Encapsulate
        carPrice = d;
    }

    public double getCarPrice() { // <= this is Encapsulation
        return carPrice;
    }

    public void increasePrice(double inc) {
        try {
            carPrice = (carPrice + inc);
            System.out.println("\nIncrease $" + inc + " to " + carModel + " - Success");
        } catch (Exception e) {
            System.out.println("\nIncrease $" + inc + " to " + carModel + " - Rejected");
        }
    }

    public void decreasePrice(double dec) { // <= this is to Encapsulate
        if ((carPrice - dec) > 1) {
            carPrice = (carPrice - dec);
            System.out.println("\nDecrease $" + dec + " from " + carModel + " - Success");
        } else {
            System.out.println("\nDecrease $" + dec + " from " + carModel + " - Rejected");
        }
    }

    public void purchaseCar() {
        try {
            System.out.println("\nPurchase " + carModel + " - price $" + carPrice);
        } catch (Exception e) {
            System.out.println("\nPurchase " + carModel + " - price $" + carPrice + " - Rrejected");
        }
    }

    public void printDetails() {
        System.out.println("Model:              " + carModel);
        System.out.println("Price:              $" + carPrice);
    }
}