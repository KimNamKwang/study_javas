package InheritanceClass;

public class InheritanceVehicleMain {
    public static void main(String[] args) {
        Vehicles vehicles = new Vehicles();
        System.out.println(vehicles.Speed(50, 3));
        System.out.println(vehicles.Weight(30, 50, 70));

        Vans vans = new Vans();
        System.out.println(vans.Speed(50, 3));
        System.out.println(vans.Weight(30, 50, 70));

        Cars cars = new Cars(3);
        System.out.println(cars.Speed(50, 3));
        System.out.println(cars.Weight(30, 50, 70));
    }
}
