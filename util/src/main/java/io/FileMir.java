package io;

import com.alibaba.fastjson.JSONObject;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

public class FileMir {
    public String getFileInfo(File file){
        long sizeNum = file.length()/1024;
        String size = String.valueOf(sizeNum);
        String name = file.getName();
        String path = file.getPath();
        String canWrite = String.valueOf(file.canWrite());
        String canRead = String.valueOf(file.canRead());

        long lastModifiedTimestamp = file.lastModified();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss:SSS'Z'");
        String lastModify = simpleDateFormat.format(lastModifiedTimestamp);

        Map<String, String> map = new HashMap<>();
        map.put("name",name);
        map.put("path",path);
        map.put("size",size+" mb");
        map.put("canWrite",canWrite);
        map.put("canRead",canRead);
        map.put("lastModify",lastModify);

        String s = JSONObject.toJSONString(map);
        return s;
    }
}
