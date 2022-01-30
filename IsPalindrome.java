public class IsPalindrome {
    static boolean isPalindrome(int number){
        int temp = number, reverseNumber = 0,lastNumber;
        while (temp!=0){
            lastNumber =temp %10;
            reverseNumber = (reverseNumber *10)+lastNumber;
            temp/=10;
        }
        if(reverseNumber !=number){
            System.out.println(number + " is not a palindrome number");
            return false;
        }
        System.out.println(number + " is a palindrome number");
        return true;
    }
    public static void main(String[] args) {
        isPalindrome(242);
        isPalindrome(114);
        isPalindrome(1554551);

    }
}
