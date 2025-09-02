public class AndroidPhone {
    private AndroidCharger androidCharger;
    public AndroidPhone(AndroidCharger androidCharger){
        this.androidCharger = androidCharger;
    }
    public void charge(){
        androidCharger.chargeAndroidPhone();
    }
}
