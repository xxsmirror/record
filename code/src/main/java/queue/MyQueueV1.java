package queue;

import java.util.ArrayList;
import java.util.List;

public class MyQueueV1 {
    private List<Integer> data;
    private int point;

    public MyQueueV1(){
        data = new ArrayList<>();
        point = 0;
    }

    public boolean enQueue(int x){
        data.add(x);
        return true;
    }

    public boolean deQueue(){
        if (isEmpty()==true){
            return false;
        }
        point++;
        return true;
    }

    public int Front(){
        return data.get(point);
    }


    public boolean isEmpty(){
        return point>=data.size();
    }

    public static void main(String[] args) {
        MyQueueV1 queueV1 = new MyQueueV1();
        queueV1.enQueue(9);
        queueV1.enQueue(10);
        queueV1.deQueue();
        System.out.println(queueV1.Front());
    }

}
