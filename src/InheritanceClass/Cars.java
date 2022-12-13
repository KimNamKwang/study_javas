package InheritanceClass;

public class Cars extends Vehicles {

    Cars(int oneway_count) {
        System.out.println("Cars - constructor");
    }

    int oneway_count = 3;

    public int Speed(int kms, int hours) {
        int result = kms / hours + this.oneway_count;
        return result;
    }
}
