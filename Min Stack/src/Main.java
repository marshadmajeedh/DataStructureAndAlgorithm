public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack(4);

        stack.push(4);
        stack.push(2);
        stack.push(3);
        stack.push(1);

        System.out.println("Min: "+stack.getMin());
        System.out.println("Popped: "+stack.pop());
        System.out.println("Min: "+stack.getMin());
        System.out.println("Popped: "+stack.pop());
        System.out.println("Min: "+stack.getMin());
        System.out.println("Popped: "+stack.pop());
        System.out.println("Min: "+stack.getMin());
        System.out.println("Topped: "+stack.top());
    }
}