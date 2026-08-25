import java.util.Arrays;

public class ReturnXORValue {
    public static int returnXOR(int[] nums, int[] query) {

        int length = query[1] -  query[0] + 1;
        if (nums.length < length) return -1;

        String[] binaryNums = new String[nums.length];

        for (int i = 0; i < binaryNums.length; i++) {
            binaryNums[i] = String.format("%32s",Integer.toBinaryString(nums[i])).replace(' ','0');
        }


        StringBuilder sum = new StringBuilder();

        String firstIndexXOR = binaryNums[query[0]];
        String secondIndexXOR = binaryNums[query[0]+1];

        for (int i = 0; i < firstIndexXOR.length(); i++) {
            if(firstIndexXOR.charAt(i) == secondIndexXOR.charAt(i)){
                sum.append("0");
            } else {
                sum.append("1");
            }
        }

        int xorValue = Integer.parseInt(sum.toString(), 2);
        //debug
        System.out.println(xorValue);
        System.out.println(sum);
        System.out.println(firstIndexXOR);
        System.out.println(secondIndexXOR);


        for (int start = query[0]+2; start <= query[1]; start++){

            StringBuilder stringBuilder = new StringBuilder();
            String binary = binaryNums[start];
            String xor = String.format("%32s",Integer.toBinaryString(xorValue)).replace(' ','0');

            for (int i = 0; i < 32; i++){

                if(binary.charAt(i) == xor.charAt(i)){
                    stringBuilder.append("0");
                }else {
                    stringBuilder.append("1");
                }
            }

            xorValue =  Integer.parseInt(stringBuilder.toString(), 2);
        }

        return xorValue;
    }

}
