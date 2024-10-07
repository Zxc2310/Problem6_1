public class CarModel extends Car {
    private final String maker;

    public CarModel(String name, String category, String maker) {
        super(name, category);
        this.maker = maker;
    }
    @Override
    public void displayDetails() {
        System.out.println("Book: " + name + ", Category: " + category + ", Maker: " + maker);
    }
}
