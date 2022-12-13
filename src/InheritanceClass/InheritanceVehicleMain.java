package InheritanceClass;

public class InheritanceVehicleMain {
    public static void main(String[] args) {
        Vehicles vehicles = new Vehicles();
        System.out.println("vehicles speed : " + vehicles.Speed(50, 3));
        System.out.println("vehicles weight : " + vehicles.Weight(30, 50, 70) + "\n");

        Vans vans = new Vans();
        System.out.println("vans speed : " + vans.Speed(50, 3));
        System.out.println("vans weight : " + vans.Weight(30, 50, 70));
        System.out.println("vans windows_count : " + vans.Windows_count(6) + "\n");

        Cars cars = new Cars(3);
        System.out.println("cars speed : " + cars.Speed(50, 3));
        System.out.println("cars weight : " + cars.Weight(30, 50, 70) + "\n");

        System.out.println("Done");
    }
}
