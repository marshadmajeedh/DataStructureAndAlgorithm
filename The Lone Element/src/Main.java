import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] arr = {6,3,2,4,2,1,4,1,3,2,1,4,3};

        int theLoneElement = GetTheLoneElement.getTheLoneElement(arr);

        System.out.println("The lone element in this array "+ Arrays.toString(arr)+" is : "+theLoneElement);
    }
}