public class Main {
    public static void main(String[] args) {
        double springCost = 200.0;
        double summerCost = 300.0;
        double fallCost = 250.0;
        double winterCost = 350.0;

        double yearlyMaintenanceCost = springCost + summerCost + fallCost + winterCost;

        System.out.println("Spring Maintenance Cost: $" + springCost);
        System.out.println("Summer Maintenance Cost: $" + summerCost);
        System.out.println("Fall Maintenance Cost: $" + fallCost);
        System.out.println("Winter Maintenance Cost: $" + winterCost);
        System.out.println("Total Yearly Maintenance Cost: $" + yearlyMaintenanceCost);
    }
}
