public class AdaptorCharger implements AppleCharger {
    private AndroidCharger androidCharger;
    
    public AdaptorCharger(AndroidCharger androidCharger){
        this.androidCharger = androidCharger;
    }
    
    @Override
    public void chargeIPhone() {
        androidCharger.chargeAndroidPhone();
        System.out.println("Adaptor Charger is charging the Iphone with Android Charger");
    }

}

