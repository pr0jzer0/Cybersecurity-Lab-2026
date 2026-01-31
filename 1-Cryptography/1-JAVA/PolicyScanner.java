import java.net.HttpURLConnection;
import java.util.Scanner;
import java.net.URL;
import java.io.InputStream;
import java.io.IOException;

public class ScannerV2  {
        public static void main (String[] agrs){
            while(true){
                Scanner sc = new Scanner(System.in);
                System.out.println("System Intitialization....");
                System.out.println("System is LIVE NOW!!");
                System.out.println("Enter the URL to Scan for Security Policy ");
                System.out.print(">");
                String Url =  sc.nextLine();
                Checkurl ch = new Checkurl(Url);
                Scan scan = new Scan(Url);
                sc.close();

}
        }
}
class Checkurl{
        public Checkurl(String url){
                if (url.length()==0){
                   System.out.println("INVALID INPUT!! TRY AGAIN");
                }
        }
}
class Scan {
        public Scan (String Url){
        try{
                        URL url = new URL(Url);
                        InputStream input = url.openStream();
                        Scanner scanner = new Scanner(input);

                        while (scanner.hasNextLine()) {
                        System.out.println(scanner.nextLine());

                        input.close();
                        }

                        } catch (IOException e) {

                         System.err.println("Failed to read from URL:");
                         e.printStackTrace();
                }

        }
}
