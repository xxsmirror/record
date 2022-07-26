package io;

import java.io.*;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("E:/资料/代码素材资料/00.sql和jar/01.jar/druid-1.1.10.jar");
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader reader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(reader);

        bufferedReader.lines().forEach(System.out::println);
    }
}
