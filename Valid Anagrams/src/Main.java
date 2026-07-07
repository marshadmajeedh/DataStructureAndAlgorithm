public class Main {
    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        boolean b = IsTwoStringsAnagrams.isAnagramsStrings(s, t);
        System.out.println("Given Strings "+s+" and "+t+" are anagrams : "+(b ? "Yes" : "No"));
    }
}