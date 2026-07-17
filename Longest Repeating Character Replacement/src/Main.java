public class Main {
    public static void main(String[] args) {
        String s = "AABABBBBBB";
        int k = 1;
        int length = ReturnLongestSubstringAfterReplacement.returnLongestSubstring(s, k);
        System.out.println("Maximum length after replacing at most k '"+k+"' times is : "+length);
    }
}