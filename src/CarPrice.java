// Concrete subclass representing a Vehicle
public class CarPrice extends Car {
    private final String engineType;
    public int CarPrice;
    public CarPrice(String name, String category, String engineType) {
        super(name, category);
        this.engineType = engineType;
    }
    @Override
    public void displayDetails() {
        System.out.println("Car: " + name + ", Category: " + category + ", Engine Type: " + engineType + ", CarPrice : " +CarPrice);

    }
}
