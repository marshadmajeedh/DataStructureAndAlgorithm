public class Main {
    public static void main(String[] args) {

        String s = "aaabbbba";
        String t = "bbbaaaba";
        boolean isIsomorphic = IsIsomorphicStrings.isIsomorphic(s, t);

        System.out.println ("Given Strings '"+s+"' & '"+t+"' , are isomorphic: "+(isIsomorphic? "yes":"No"));
    }
}