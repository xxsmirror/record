package stream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        File file = new File("E:\\pk.csv");
        List<String> list = new ArrayList<>();
        LineIterator it = null;
        try {
            it = FileUtils.lineIterator( file,"UTF-8");
            while (it.hasNext()) {
                String line = it.nextLine();
                String[] item = line.split(",");
                for (int i = 0; i < item.length; i++) {
                    list.add(item[i]);
                }

            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        for(String ai:list) System.out.println(ai);
//         list.stream()
//                .limit(100)
//                .map(e->e.toUpperCase()+"1")
//                .forEach(System.out::println);



    }
}
