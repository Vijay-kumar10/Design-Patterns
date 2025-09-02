public class MainTest {
   public static void main(String[] args) {
    
      AdaptorCharger adaptorCharger = new AdaptorCharger(new ChargerA2());

      ApplePhone iphone11 = new ApplePhone(adaptorCharger);
      iphone11.charge();
      
      System.out.println("Programme Started...");
      ApplePhone iphone12 = new ApplePhone(new ChargerA1());
      iphone12.charge();
      System.out.println("Programme Ended...");
   } 
}
