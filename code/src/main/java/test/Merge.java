package test;

import java.util.Random;

public class Merge {
    public static void main(String[] args) {
      int[] ints = new int[]{1,15,22,9,7,4,21,6,5,88};
      process(ints,1,7);
        System.out.println(c);
    }
    private static int c=0;
    public static void process(int[] arr,int L,int R)
    {
        if(L==R){
            return;
        }
        c++;
        int mid = L+((R-L)>>1);

        process(arr,L,mid);

        process(arr,mid+1,R);

    }
}
