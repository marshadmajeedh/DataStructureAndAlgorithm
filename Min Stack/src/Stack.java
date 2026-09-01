import java.util.HashMap;

public class Stack {
    private final int[] array;
    private int size = 0;
    private int min = Integer.MAX_VALUE;

    HashMap<Integer, Integer> map = new HashMap<>();


    public Stack(int size) {
        array = new int[size];
    }

    public boolean isFull(){
        return size == array.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void push(int data) {
        if(!isFull()) {
            //2,3,1
            if(min > data) {
                map.put(size, data);
                min = data;
            } else {
                map.put(size,min);
            }
            array[size++] = data;
        }

    }

    public int pop(){
        if(isEmpty()){
            return -1;
        }
        //2,3,1
        int tempSize = size;
        if(array[--tempSize] == min){
            if(tempSize > 0) {
                min = map.get(tempSize - 1);
            }else{
                min = -1;
            }
        }
        return array[--size];
    }

    public int top(){
        if(isEmpty()){
            return -1;
        }
        return array[size-1];
    }

    public int getMin(){
        return min;
    }
}
