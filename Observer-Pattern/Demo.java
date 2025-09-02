import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Demo {
 public static void main(String[] args) throws NumberFormatException, IOException {
    YoutubeChannel yt = new YoutubeChannel();
    Subscriber s1 = new Subscriber("Vijay");
    Subscriber s2 = new Subscriber("Parmjeet");
    Subscriber s3 = new Subscriber("Nitin");

    yt.subscribe(s1);
    yt.subscribe(s2);
    yt.subscribe(s3);

    yt.newVideoUploaded("Design Pattern in Java");

    yt.unSubscribe(s2);

    yt.newVideoUploaded("Observer Pattern in Java");
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    while(true){
        System.out.println("Press 1 to upload new video");
        System.out.println("Press 2 to create a new subscriber");
        System.out.println("Press 3 to exit");
        int c = Integer.parseInt(bf.readLine());
        if(c==1){
            System.out.println("Enter video title");
            String title = bf.readLine();
            yt.newVideoUploaded(title);
        } else if(c==2){
            System.out.println("Enter subscriber name");
            String name = bf.readLine();
            Subscriber s = new Subscriber(name);
            System.out.println("Subscriber created : "+name);
            yt.subscribe(s);
        } else {
            break;
        }
    }
  
}
}
