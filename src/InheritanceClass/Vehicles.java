package InheritanceClass;

public class Vehicles extends Object {

   // 펑션 두개 speed,

   // Vehicles constructor
   Vehicles() {
      System.out.println("Vehicles - constructor");
   }

   public int Speed(int kms, int hours) {
      int result = kms / hours;
      return result;

   }

   public int Weight(int height, int width, int depth) {
      int result = height * width * depth;
      return result;
   }

}
