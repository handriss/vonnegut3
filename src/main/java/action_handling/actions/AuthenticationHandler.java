package action_handling.actions;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Objects;


public class AuthenticationHandler {

    private String targetURL;
    private String urlParameters;
    private String username;

    public AuthenticationHandler(String username, String password) {
        this.username = username;
        targetURL = "https://admin.bookline.hu/user/login.action";
        urlParameters = "username=" + username + "&password=" + password + "&submit=bel%C3%A9p%C3%A9s&returnUrl=";
    }


    public String login() {
        URL url;
        HttpURLConnection connection = null;

        try {
            //Create connection
            url = new URL(targetURL);
            connection = (HttpURLConnection)url.openConnection();
            connection.setRequestMethod("POST");

            // Setting the requests properties (de oda van egyébként írva):
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setRequestProperty("Content-Length", "" + Integer.toString(urlParameters.getBytes().length));
            connection.setRequestProperty("Connection", "keep-alive");
            connection.setRequestProperty("Cache-Control", "max-age=0");
            connection.setRequestProperty("Origin", "https://admin.bookline.hu");
            connection.setRequestProperty("Upgrade-Insecure-Requests", "1");
            connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
            connection.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
            connection.setRequestProperty("Referer", "https://admin.bookline.hu/user/login!redirectInput.action");

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
            List<String> cookies = connection.getHeaderFields().get("Set-Cookie");
            if(getAuthenticationResult(response.toString())){
                return cookies.get(0).split(";")[0];
            }else{
                return "Unsuccessful";
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;

        } finally {
            if(connection != null) {
                connection.disconnect();
            }
        }
    }

    private boolean getAuthenticationResult(String htmlContent){
        Document document = Jsoup.parse(htmlContent);
        String result = document.getElementsByClass("username").text();

        if(Objects.equals(result, username)){
            return true;
        } else{
            return false;
        }
    }

    public String logout(){
        return "";
    }
}
