public class Main {
    public static void main(String[] args) {

        char[][] matrix1 =
                {
                        {'1','0','1','0','0'},
                        {'1','0','1','1','1'},
                        {'1','1','1','1','1'},
                        {'1','0','0','1','0'}
                };

        char[][] matrix2 = {
                {'1','1'},
                {'0','1'},
        };
        char[][] matrix3 = {
                {'1','1','1'},
                {'1','1','1'},
                {'0','0','0'}
        };

        int maximumRectangleArea = MaximumRectangleInABinaryMatrix.returnMaximumRectangle(matrix3);
        System.out.println(maximumRectangleArea);
    }
}