package web.http;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class jsoupTry {
    public static void main(String[] args) {
        try {
            Connection.Response response = Jsoup.connect("https://cn.bing.com/")
                    .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/76.0.3809.132 Safari/537.36")

                    .execute();
            Document document = Jsoup.parse(response.body());
            Elements element = document.getElementsByTag("a");

            System.out.println(element.get(1));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
