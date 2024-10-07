public abstract class Car {
    protected String name;
    protected String category;

    public Car(String name, String category) {
        this.name = name;
        this.category = category;
    }
    public abstract void displayDetails();

    public double computeValue(double parameter) {
        return parameter * 10;
    }
}




