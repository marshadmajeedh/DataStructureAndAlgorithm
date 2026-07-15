public class Main {
    public static void main(String[] args) {

        String s = "anagram";
        String t ="nagaram";
        boolean isAnagram = IsStringAnagram.isAnagramOfS(s, t);
        System.out.println("String '"+s+"' and String '"+t+"' are anagrams : "+((isAnagram) ? "Yes" : "No"));
    }
}