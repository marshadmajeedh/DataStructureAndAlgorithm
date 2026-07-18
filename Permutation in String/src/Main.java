public class Main {
    public static void main(String[] args) {
        String s1 = "adc";
        String s2 = "dcda";
        boolean isPermutation = IsStringContainsPermutationOfAnotherString.isPermutation(s1, s2);
        System.out.println("S2 '"+s2+"' contains anagram of S1 '"+s1+"' ? "+((isPermutation) ? "Yes" : "No"));
    }
}