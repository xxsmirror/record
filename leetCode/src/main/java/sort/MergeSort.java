package sort;

/**
 * @author mq
 * @date 2022/7/27 10:52
 */
public class MergeSort {
    public static void sort(int[] arr,int L,int R){
        if(L==R){
            return;
        }
        int mid = L+((R-L)>>1);
        sort(arr,L,mid);
        sort(arr,mid+1,R);
        merge(arr,L,mid,R);
    }
    private static void merge(int[] arr,int L,int M,int R){
        int[] temps = new int[R-L+1];
        int i = 0;
        int p1 = L;
        int p2 = M+1;

        while (p1<=M && p2<=R){
            temps[i++]=arr[p1]<=arr[p2]?arr[p1]:arr[p2];
        }
        while (p1<=M){
            temps[i++]=arr[p1++];
        }
        while (p2<=R){
            temps[i++]=arr[p2++];
        }
        for (i=0; i < temps.length; i++) {
            arr[L+i] = temps[i];
        }
    }
}
