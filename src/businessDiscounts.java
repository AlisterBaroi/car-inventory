// this is third subclass of Cars superclass, and also the abstract class
public abstract class businessDiscounts extends Cars {
    private double bundleDiscount1; // <<= third encapsulated attribute of subclass
    private double bundleDiscount2; // <= fourth encapsulated attribute of subclass

    public businessDiscounts(String a, double b, double c, double d) {
        super(a, b);
        bundleDiscount1 = c;
        bundleDiscount2 = d;
    }

    public void setDiscount1(double q) { // <= this is to Encapsulate
        bundleDiscount1 = q;
    }

    public double getDiscount1() { // <= this is Encapsulation
        return bundleDiscount1;
    }

    public void setDiscount2(double r) { // <= this is to Encapsulate
        bundleDiscount2 = r;
    }

    public double getDiscount2() { // <= this is Encapsulation
        return bundleDiscount2;
    }

    public abstract void printBusinessDiscounts(); // <= Creating abstract method
}
