package web.http;

public class Test {
    public static void main(String[] args) {
        String result = HttpGetter.build()
                .setUrl("https://cn.bing.com/")

                .doGet();
        System.out.println(result);

    }

}
