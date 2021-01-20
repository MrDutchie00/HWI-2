import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

public class ConnectieClass {

    public String getConnection() throws URISyntaxException, IOException {
        String connection = "";
        //Instantiating the URL class
        URI url = new URI("https://bp6.adainforma.tk/boeboys/index.php");
        //Retrieving the contents of the specified page
        Scanner sc = new Scanner(url.toURL().openStream());
        //Instantiating the StringBuffer class to hold the result
        StringBuffer sb = new StringBuffer();
        while(sc.hasNext()) {
            sb.append(sc.next());
        }
        //Retrieving the String from the String Buffer object
        String result = sb.toString();
        System.out.println(result);
        //Removing the HTML tags
        result = result.replaceAll("<[^>]*>", "");
        connection = result;
        System.out.println(connection);
        return connection;
    }
}
