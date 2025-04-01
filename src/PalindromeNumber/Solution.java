package PalindromeNumber;

public class Solution {
    public static void main(String[] args) {
        int a = 121;
        int b = -121;
        int c = 8888;

        System.out.println(isPalindrome(a) + "\n" + isPalindrome(b) + "\n" + isPalindrome(c));

    }

    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return s.equals(reversed);
    }
}