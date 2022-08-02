package dp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String s = "dood";
        String s1 =solution(s);
        System.out.println(s1);
    }

    //同字母间隔最长
    public static String solution(String s)
    {
        int skewer = 1;
        List<Integer> list = new ArrayList<>();
        List<String> listResult = new ArrayList<>();
        for(int i=1;i<s.length();i++)
        {
            for(int j=i-1;j>=0;j--)
            {
                skewer++;
                char io = s.charAt(i);
                char jo = s.charAt(j);
                if (jo==io)
                {
                    list.add(skewer);
                    listResult.add(s.substring(j,i+1));
                }
            }
            skewer = 1;
        }
        Integer max = Collections.max(list);
        int index = list.indexOf(max);
        return listResult.get(index);
    }
}

