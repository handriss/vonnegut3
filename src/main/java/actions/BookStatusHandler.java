package actions;


import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class BookStatusHandler {

    public static boolean activate(String barcode, String sessionId){

        String targetURL = "https://admin.bookline.hu/product/activateOldbook!activate.action";
        String urlParameters = "vonalkod=" + barcode + "&submit=aktiv%C3%A1l";

        URL url;
        HttpURLConnection connection = null;

        try {
            //Create connection
            url = new URL(targetURL);
            connection = (HttpURLConnection)url.openConnection();
            connection.setRequestMethod("POST");

            // Setting the requests properties
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setRequestProperty("Connection", "keep-alive");
            connection.setRequestProperty("Cache-Control", "max-age=0");
            connection.setRequestProperty("Origin", "https://admin.bookline.hu");
            connection.setRequestProperty("Upgrade-Insecure-Requests", "1");
            connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
            connection.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
            connection.setRequestProperty("Referer", "https://admin.bookline.hu/product/activateOldbook!activate.action");

            connection.setRequestProperty("Cookie", sessionId);
            connection.setUseCaches (false);
            connection.setDoInput(true);
            connection.setDoOutput(true);

            //Send request
            DataOutputStream wr = new DataOutputStream (connection.getOutputStream());
            wr.writeBytes (urlParameters);
            wr.flush ();
            wr.close ();

            //Get Response
            InputStream is = connection.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
            String line;
            StringBuilder response = new StringBuilder();
            while((line = rd.readLine()) != null) {
                response.append(line);
                response.append('\n');
                    System.out.println(line);
            }

            rd.close();

            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;

        } finally {
            if(connection != null) {
                connection.disconnect();
            }
        }
    }

//    public static boolean deactivate(String barcode){
//
//    }
}
