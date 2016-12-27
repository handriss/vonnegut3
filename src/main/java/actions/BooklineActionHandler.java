package actions;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

public class BooklineActionHandler {

    private static final Map<String, String> finalRequestProperties;
    static {
        Map<String, String> tempMap = new HashMap<>();
        tempMap.put("Connection", "keep-alive");
        tempMap.put("Cache-Control", "max-age=0");
        tempMap.put("Origin", "https://admin.bookline.hu");
        tempMap.put("Upgrade-Insecure-Requests", "1");
        tempMap.put("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
        tempMap.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
        tempMap.put("Content-Type", "application/x-www-form-urlencoded");
        finalRequestProperties = Collections.unmodifiableMap(tempMap);
    }

    public static String login(String username, String password){
        String targetURL = "https://admin.bookline.hu/user/login.action";
        String requestMethod = "POST";
        String urlParameters = "username=" + username + "&password=" + password + "&submit=bel%C3%A9p%C3%A9s&returnUrl=";
        String sessionId = null;
        return sendRequest(targetURL, requestMethod, sessionId, urlParameters);
    }

    public static String logout(String sessionId){
        String targetURL = "https://admin.bookline.hu/user/logout.action";
        String requestMethod = "POST";
        String urlParameters = "";
        return sendRequest(targetURL, requestMethod, sessionId, urlParameters);
    }


    public static void activate(String barcode, String sessionId){

        String targetURL = "https://admin.bookline.hu/product/activateOldbook!activate.action";
        String requestMethod = "POST";
        String urlParameters = "vonalkod=" + barcode + "&submit=aktiv%C3%A1l";

        sendRequest(targetURL, requestMethod, sessionId, urlParameters);
    }

    public static void deactivate(String productId, String sessionId){
        String targetURL = "https://admin.bookline.hu/product/sellOldbook!sell.action?apid0=10:" + productId;
        String requestMethod = "POST";
        String urlParameters = null;

        sendRequest(targetURL, requestMethod, sessionId, urlParameters);
    }

    private static String sendRequest(String targetURL, String requestMethod, String sessionId, String urlParameters){

        URL url;
        HttpURLConnection connection = null;

        try{
            url = new URL(targetURL);
            connection = (HttpURLConnection)url.openConnection();
            connection.setRequestMethod(requestMethod);

            for(Map.Entry<String, String> entry : finalRequestProperties.entrySet()){
                connection.setRequestProperty(entry.getKey(), entry.getValue());
            }
            if(sessionId != null){
                connection.setRequestProperty("Cookie", sessionId);
            }
            connection.setRequestProperty("Referer", targetURL);
            connection.setDoInput(true);
            connection.setDoOutput(true);

            DataOutputStream wr = new DataOutputStream (connection.getOutputStream());
            if(urlParameters != null){
                wr.writeBytes (urlParameters);
                wr.flush ();
            }
            wr.close ();

            InputStream is = connection.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
            String line;
            StringBuilder response = new StringBuilder();
            while((line = rd.readLine()) != null) {
                response.append(line);
                response.append('\n');
            }

//            System.out.println("----------------------------------------------------");
//            System.out.println(response);
//            System.out.println("----------------------------------------------------");


            rd.close();

            if(sessionId == null && getAuthenticationResult(response.toString())){
                List<String> cookies = connection.getHeaderFields().get("Set-Cookie");
                return cookies.get(0).split(";")[0];
            }


        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(connection != null) {
                connection.disconnect();
            }
        }
        return "";
    }

    private static boolean getAuthenticationResult(String htmlContent){
        Document document = Jsoup.parse(htmlContent);
        String result = document.getElementsByClass("username").text();

        if(!Objects.equals(result, "")){
            return true;
        }else {
            return false;
        }
    }
}
