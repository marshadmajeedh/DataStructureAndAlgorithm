public class Main {
    public static void main(String[] args) {
        int n = 100;
        boolean isCyclicNumber = ReturnIsCyclicNumber.isCyclic(n);
        System.out.println(n+" is Cyclic number : "+((isCyclicNumber) ? "No" : "Yes"));
    }
}