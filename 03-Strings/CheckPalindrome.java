// Check if a string is a palindrome   

class CheckPalindrome {
    public static void main(String[] args) {
        String s = "Hello";
        String newString = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            newString += s.charAt(i);
        }
        if (newString.equals(s)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
