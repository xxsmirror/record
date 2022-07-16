package web.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class HttpGetter {
    private String url = "";
    private String param = "";

   public static HttpGetter build(){
       return new HttpGetter();
   }

   public HttpGetter setUrl(String url)
   {
       this.url = url;
       return this;
   }

   public HttpGetter setParam(String param)
   {
       this.param = param;
       return this;
   }

   public String doGet()
   {
       StringBuffer result = new StringBuffer();
       BufferedReader in = null;
       try {
           String wholeURL = url+"?"+param;
           URL newUrl = new URL(wholeURL);
           URLConnection connection = newUrl.openConnection();
           connection.setRequestProperty("accept","*/*");
           connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
           connection.connect();

           Map<String, List<String>> map = connection.getHeaderFields();
           map.keySet().stream()
                   .forEach(key-> System.out.println(key+": "+map.get(key)));

           in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
           String line;
           while ((line = in.readLine())!=null){
               result.append(line);
           }

       } catch (MalformedURLException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }
       finally {
           try {
               in.close();
           } catch (IOException e) {
               e.printStackTrace();
           }
       }
       return result.toString();
   }

}
