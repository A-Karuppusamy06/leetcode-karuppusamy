// Last updated: 8/11/2026, 6:34:38 PM
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }

        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (!charToWord.containsKey(c)) {
                charToWord.put(c, word);
            }

            if (!wordToChar.containsKey(word)) {
                wordToChar.put(word, c);
            }

            if (!charToWord.get(c).equals(word) || !wordToChar.get(word).equals(c)) {
                return false;
            }
        }

        return true;        
    }
}