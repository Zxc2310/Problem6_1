public class Main {
    public static void main(String[] args) {
       CarModel CM = new CarModel("TF2 Speed", "Tesla", "Tesla Power");
        CarPrice CP = new CarPrice("Tesla Model S", "Electric Car", "Electric");
        Spare parts = new Spare("JTY Engine", "Power source", "Tesla");

        System.out.println("\nObject Details:");
        CM.displayDetails();
        CP.displayDetails();
        parts.displayDetails();

        System.out.println("\nComputed Values:");
        System.out.println(CM.name + ": " + CM.computeValue(27));
        System.out.println(CP.name + ": " + CP.computeValue(789000));
        System.out.println(parts.name + ": " + parts.computeValue(37600));
    }
}
