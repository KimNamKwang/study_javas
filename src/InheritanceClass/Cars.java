package InheritanceClass;

public class Cars extends Vehicles {
    int oneway_count = 0;

    Cars(int oneway_count) {

    }

    public int Speed(int kms, int hours) {
        int result = kms / hours + this.oneway_count;
        return result;
    }
}
