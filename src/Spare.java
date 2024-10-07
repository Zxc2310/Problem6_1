public class Spare extends Car {
    private final String brand;
    public Spare(String name, String category, String brand) {
        super(name, category);
        this.brand = brand;
    }
    @Override
    public void displayDetails() {
        System.out.println("Gadget: " + name + ", Category: " + category + ", Brand: " + brand);
    }
}
