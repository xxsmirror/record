package sort;

import static sort.Swap.swap;

public class HeapSort {
    public static void heapInsert(int[] arr,int index){
        while (arr[index]>arr[(index-1)/2]){
            swap(arr,index,(index-1)/2);
            index = (index-1)/2;
        }
    }
    public static void heapify(int[] arr,int index,int heapSize){
        int left = index*2+1;
        while (left<heapSize){
            int larger = left + 1<heapSize && arr[left+1]>arr[left]?left+1:left;
            larger = arr[larger]>arr[index]?larger:index;
            if(larger==index){
                break;
            }
            swap(arr,larger,index);
            index=larger;
            left=index*2+1;
        }
    }

    public static void heapSort(int[] arr){
        if(arr == null||arr.length<2){return;}
//        for (int i=0;i<arr.length;i++){
//            heapInsert(arr,i);
//        }
        for (int i=arr.length-1;i>=0;i--){
            heapify(arr,i, arr.length);
        }
        int heapSize = arr.length;
        swap(arr,0,--heapSize);
        while (heapSize>0){
            heapify(arr,0,heapSize);
            swap(arr,0,--heapSize);
        }

    }
}
