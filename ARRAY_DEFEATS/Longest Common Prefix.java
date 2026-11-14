//THIS QESTION WAS A TOTAL CURVEBALL.I HAD NO IDED WHAT TO DO. 
//I THOUGHT OF USING A HASHMAP BUT THAT DIDNT WORK. MUY MID WAS NOT ABLE TO THINK OF A SOLUTION WITH ARRAY AS THE THNGS HAD CHARACTERS AND I POCESSED IT WITH IT.

// THE SOLUTION HAD THE SAME METHODILOGY WHICH I THOUGHT OF. COMAPARING THE FIRST WORD WITH THE NEXT AND SO ON WHAT EVER IS COMMON JUST STORE THAT IN A STRING AND GET BACK TO IT.

// HOWEVER I WAS NOT ABLE TO SOLVE IT. I HAD TO LOOK AT THE SOLUTION AS I GOT DEFEATED.

// HERE IS THE CODE (JUST THE FUCTION ) :

/*class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        
        String pref = strs[0];
        int prefLen = pref.length();

        for (int i = 1; i < strs.length; i++) {
            String s = strs[i];
            while (prefLen > s.length() || !pref.equals(s.substring(0, prefLen))) {
                prefLen--;
                if (prefLen == 0) {
                    return "";
                }
                pref = pref.substring(0, prefLen);
            }
        }

        return pref;        
    }
}
*/
// BELOW ID THE FULL CODE WITH THE MAIN FUNCTION.

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String pref = strs[0];
        int prefLen = pref.length();

        for (int i = 1; i < strs.length; i++) {
            String s = strs[i];
            while (prefLen > s.length() || !pref.equals(s.substring(0, prefLen))) {
                prefLen--;
                if (prefLen == 0) {
                    return "";
                }
                pref = pref.substring(0, prefLen);
            }
        }

        return pref;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(sol.longestCommonPrefix(strs));  // fl
    }
}