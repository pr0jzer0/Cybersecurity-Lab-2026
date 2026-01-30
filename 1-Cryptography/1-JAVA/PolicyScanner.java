import java.net.HttpURLConnection;
import java.util.Scanner;
import java.net.URL;
import java.io.InputStream;
import java.io.IOException;

public class PolicyScanner {
	public static void main (String[] agrs){
			try{
			System.out.println("System Initialization...");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter an URL (For ex. https://www.examplehospital.com/privacy-policy) :-");
			String Url = sc.nextLine();
			URL url = new URL(Url);
		        InputStream input = url.openStream();
		        Scanner scanner = new Scanner(input);

            		while (scanner.hasNextLine()) {
               			System.out.println(scanner.nextLine());
            		}

		        scanner.close();
            		input.close();
			sc.close();
        		} catch (IOException e) {
           
           		 System.err.println("Failed to read from URL:");
           		 e.printStackTrace();
        }
    }
}
