package LeetCode.Easy;
//Binary Search

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/

// Input: letters = ["c","f","j"], target = "a"
// Output: "c"

//Input: letters = ["c","f","j"], target = "d"
//Output: "f"

class Find_Smallest_Letter_Greater_Than_Target_744 {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'j';
        char ans = nextGreatestLetter(letters, target);
        System.out.println(ans);
    }


    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        if (target >= letters[letters.length - 1]) {
            return letters[0];
        }
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start];
    }
}