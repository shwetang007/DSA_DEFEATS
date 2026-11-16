/*
this one i had good idea and was able to dedue a pattern of below :

array to string -> string to num+1 -> num to string -> string to array

however in that big nukbers was not able to parse and not much optimal
*/

// my approach 

class Solution {
    public int[] plusOne(int[] digits) {
        String s = "";
        for (int i = 0; i < digits.length; i++) {
            s += digits[i];
        }
        long res = Long.parseLong(s);
        res++;
        String resStr = Long.toString(res);
        int[] arr = new int[resStr.length()];
            for (int i = resStr.length() - 1; i >= 0; i--) {
            arr[i] = (int) (res % 10);
            res = res / 10;
        }
        return arr;
    }
}

class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + 1 != 10) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;        
    }
}