package LeetCode.Array.Easy;

//https://leetcode.com/problems/check-if-the-sentence-is-pangram/
public class Check_If_the_Sentence_is_Pangram_1832 {
    public static void main(String[] args) {
        String  sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean ans=checkIfPangram(sentence);
        System.out.println(ans);
    }
    static boolean checkIfPangram(String sentence) {
        boolean[] letters  = new boolean[26];
        sentence=sentence.toLowerCase();
        for(int i=0;i<sentence.length();i++){
            char ch=sentence.charAt(i);
            letters[ch-'a']=true;
            //is a kind of clever way to get the position of the character in the alphabet. 'a' - 'a' would give you 0. 'b' - 'a' would give you 1. 'c' - 'a' would give you 2, and so on.

            // and then it makes the position of letters array as true and it may also override true due to duplicate  values

        }
        for(int i=0;i<letters.length;i++){
            if(!letters[i]){
                return false;
            }
        }
        return true;
    }

}
