public class MainTest {
 public static void main(String[] args) {
    ProtoType car1 = new Car("BMW", "Black");
    System.out.println(car1);
    ProtoType car2 = car1.getClone();
    System.out.println(car2);
    System.out.println(car1 == car2);
 }   
}
