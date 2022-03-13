// main programm
public class App {

    public void init() {
        // Creating Car Object Instances (Instantiation Of Classes)
        familyCars familyCar1 = new familyCars("Toyota-Corolla", 7500, 270, 1200);
        familyCars familyCar2 = new familyCars("Hyundai-Kona", 6000); // <= 1 instance using method overloading)
        sportsCars sportsCar1 = new sportsCars("Audi-R8", 80000, 3.9, 320, 5000);
        familyCars familyCar3 = new familyCars("BMW-S2", 8000, 250, 1200);
        familyCars familyCar4 = new familyCars("Ford-Focus", 10000, 280, 1500);
        sportsCars sportsCar2 = new sportsCars("Nissan-GTR", 98000, 3.4, 380, 7000);
        sportsCars sportsCar3 = new sportsCars("Bugatti Chiron", 120000, 2.9, 460, 14000);
        businessCars businessCar1 = new businessCars("Mercedes-Benz AMG", 15000, 7000, 12000, 4, 170);

        // Printing Car Instance Details
        familyCar1.printDetails();
        familyCar2.printDetails();
        sportsCar1.printDetails();
        // transaction start
        familyCar1.increasePrice(2000);
        familyCar2.decreasePrice(7000);
        familyCar2.decreasePrice(1000);
        sportsCar1.increasePrice(1000);
        sportsCar1.purchaseCar();
        sportsCar3.purchaseCar();
        // transaction end
        familyCar3.printDetails();
        familyCar4.printDetails();
        sportsCar2.printDetails();
        sportsCar3.printDetails();
        businessCar1.printDetails();
    }

    public static void main(String[] args) throws Exception {
        App app = new App(); // <= Instantiation of the programe
        app.init();
    }
}