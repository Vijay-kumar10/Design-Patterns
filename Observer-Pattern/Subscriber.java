public class Subscriber implements Observer{
    String name;
    public Subscriber(String name){
        this.name = name;
    }
    @Override
    public void notified(String str) {
        System.out.println("Hey "+this.name+" New Video Uploaded : "+str);
    }

}
