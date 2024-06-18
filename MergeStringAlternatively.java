public class MergeStringAlternatively {

    public static void main(String args[]) {
        String word1 = "Nithish";
        String word2 = "Reddy";
        // add string buffer ( thread safe and mutable)
        StringBuffer sb = new StringBuffer();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                sb.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                sb.append(word2.charAt(i));
            }
            i++;
        }
        System.out.println("Alternative String " + sb);
    }

}
