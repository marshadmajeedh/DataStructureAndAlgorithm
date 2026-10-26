import java.util.LinkedList;
import java.util.Queue;

public class Algorithm {

    Queue<Integer> queue;

    public Algorithm() {
        queue = new LinkedList<>();
    }

    //3000
    //1,3,3001,3002,3003
    public int ping(int t){

        if (!queue.isEmpty()){
            int lastInserted = ((LinkedList<Integer>)queue).getLast();

            if (lastInserted > t){
                return -1;
            }
        }

        //1,100,3001,3002
        int rangeStart = t - 3000;
        queue.add(t);

        while (!queue.isEmpty() && rangeStart > queue.peek()){
            queue.poll();
        }

        return queue.size();
    }
}
