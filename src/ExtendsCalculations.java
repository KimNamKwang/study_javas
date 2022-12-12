public class ExtendsCalculations extends Calculations {
    ExtendsCalculations() {
        System.out.println("ExtendsCalculations - constructor");
    }

    public int multiplications(int first, int second) {
        int result = first * second;
        return result;
    }

    // public Methods subtraction
    public int subtraction(int first, int second) {
        int result = second - first;
        return result;
    }
}
