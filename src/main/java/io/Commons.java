package io;

import java.io.*;
import java.util.Scanner;

public class Commons {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("E:\\pk.csv");
        Scanner sc = new Scanner(inputStream, "UTF-8");
        int flag = 0;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
            Bean bean = new Bean();
            bean.setVar1("a");
            flag++;

        }
        System.out.println(flag);
    }


}
