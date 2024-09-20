package slidingwindow.fixedlength;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: leetcode
 * @description:
 * @author: XuYifei
 * @create: 2024-09-20
 */

// leetcode 1456
class Solution1 {
    private static final Set<Character> VOWELS = new HashSet<>(Set.of('a', 'e', 'i', 'o', 'u'));

    public int maxVowels(String s, int k) {
        if (k > s.length()){
            return 0;
        }
        int maxCnt = 0, currentVowelCnt = 0;

        for(int i = 0; i < k; i++){
            if(VOWELS.contains(s.charAt(i))){
                currentVowelCnt++;
                maxCnt = Math.max(maxCnt, currentVowelCnt);
            }
        }

        for(int i = k; i < s.length(); i++){
            if(VOWELS.contains(s.charAt(i - k))){
                currentVowelCnt--;
            }
            if(VOWELS.contains(s.charAt(i))){
                currentVowelCnt++;
            }
            maxCnt = Math.max(maxCnt, currentVowelCnt);
        }

        return maxCnt;
    }
}
