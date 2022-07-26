package io;

import java.io.File;
import java.io.IOException;

public class FileMir {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\pk.csv");
        //获取文件名 test.csv
        String fileName = file.getName();
        //获取路径名 E:\test.csv
        String filePath = file.getPath();

        boolean isRename = file.renameTo(new File("E:\\best.csv"));

        boolean exists = file.exists();
        file.createNewFile();

        //文件过滤
        String[] list = file.list((dir, name) ->
            name.endsWith(".txt")||dir.length()>500000
        );
        System.out.println(isRename);
    }
}
