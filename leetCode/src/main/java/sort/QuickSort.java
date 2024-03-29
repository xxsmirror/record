package sort;

public class QuickSort {

    public static void quickSort(int[] arr,int L,int R){
        if(L < R){
            Swap.swap(arr,L+(int)(Math.random()*(R-L+1)),R);
            int[] p = partition(arr,L,R);
            quickSort(arr,L,p[0]-1);
            quickSort(arr,p[1]+1,R);
        }
    }

    public static int[] partition(int[] arr,int L,int R){
        int less = L-1;
        int more = R;
        while (L < more){
            if(arr[L]<arr[R]){
                Swap.swap(arr,++less,L++);
            }else if(arr[L]>arr[R]){
                Swap.swap(arr,--more,L);
            } else {
                L++;
            }

        }
        Swap.swap(arr,more,R);
        return new int[]{less+1,more};
    }
}
