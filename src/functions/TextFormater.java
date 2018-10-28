package functions;

public class TextFormater {
    public static int countWords(String s) {
        s = s.trim();
        String[] words = s.split("\\s+");
        int wordsNumber = words.length;
        return wordsNumber;
    }

    public static boolean isContainsPalindrome(String s) {
        s = s.trim();
        if(s.equals("")) {
            return false;
        }
        String[] words = s.split("\\s+");
        StringBuilder sb;
        String s1;
        for(String word : words) {
            sb = new StringBuilder(word);
            s1 = sb.reverse().toString();
            if(word.equals(s1)) {
                return true;
            }
        }
        return false;
    }
}

