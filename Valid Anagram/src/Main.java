public class Main {
    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";
        System.out.println(s+" and "+t+" are anagram ? "+(Algorithm.isValidAnagram(s,t) ? "Yes" : "No"));
    }
}