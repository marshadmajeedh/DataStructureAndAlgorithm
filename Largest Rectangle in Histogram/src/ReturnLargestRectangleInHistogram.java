import java.util.*;

public class ReturnLargestRectangleInHistogram {
    public static List<Integer> largestRectangleArea(int[] heights) {

        //1,2,3,4,5

        if (heights.length == 1){
            return List.of(heights[0]);
        }

        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        Map<List<Integer>,Integer> map3 = new HashMap<>();

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        for (int i = 0; i < heights.length; i++) {
            //1,2,3,4,5
            while(!stack1.isEmpty() && heights[stack1.peek()] >  heights[i]) {
                map1.put(stack1.pop(),i);
            }

            while(!stack2.isEmpty() && heights[stack2.peek()] >  heights[heights.length - i -1]) {
                map2.put(stack2.pop(),heights.length - i -1);
            }
            stack1.push(i);
            stack2.push(heights.length - i - 1);

        }

        System.out.println("Map1 : "+map1);
        System.out.println("Map2 : "+map2);

        for (int i = 0; i < heights.length; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            //2,4,2
            if(map1.containsKey(i) &&  map2.containsKey(i)){
                int gap = map1.get(i) -  map2.get(i) - 1;
                int area =  heights[i] * gap;
                int end = map1.get(i)-1;
                int start = map2.get(i)+1;

                while (start <= end) {
                    list.add(heights[start]);
                    start++;
                }
                map3.put(list,area);

            } else if (map1.containsKey(i) && !map2.containsKey(i)){

                int gap = map1.get(i) - ( -1 )- 1;
                int area = heights[i] * gap;
                list.add(heights[i]);
                map3.put(list,area);

            } else if (!map1.containsKey(i) && map2.containsKey(i)){

                int gap = heights.length - map2.get(i)-1;
                int area = heights[i] * gap;
                list.add(heights[i]);
                map3.put(list,area);

            } else {
                int gap = heights.length - (-1) -1;
                int area = heights[i] * gap;
                list.add(heights[i]);
                map3.put(list,area);
            }
        }


        ArrayList<Integer> list = new ArrayList<>();
        int maxArea = 0;
        System.out.println(map3);
        for(Map.Entry<List<Integer>,Integer> entry:map3.entrySet()){
            maxArea = Math.max(maxArea,entry.getValue());
        }

        for (Map.Entry<List<Integer>,Integer> entry: map3.entrySet()){
            if(entry.getValue() == maxArea){
                list.addAll(entry.getKey());
                break;
            }
        }
        return list;
    }
}
