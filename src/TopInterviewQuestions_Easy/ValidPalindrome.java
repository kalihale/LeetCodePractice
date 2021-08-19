package TopInterviewQuestions_Easy;

/**
 * ／(•ㅅ•)＼
 *
 * @author Kali Hale
 * @since 2021-08-14
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/883/
 * Complete and correct.
 */

public class ValidPalindrome
{
    public boolean isPalindrome(String s)
    {
        // ／(•ㅅ•)＼ Remove everything except alphanumeric characters. Convert all alphanumeric characters to lowercase.
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) < '0' || (s.charAt(i) > '9' && s.charAt(i) < 'a') || s.charAt(i) > 'z')
            {
                s = s.replace(String.valueOf(s.charAt(i)), "");
                i--;
            }
        }

        if (s.length() == 0)
        {
            return true;
        }

        // ／(•ㅅ•)＼ Loop from 0 to s.length / 2, comparing the ends, then the second to the end, etc.
        for (int i = 0; i <= s.length() / 2; i++)
        {
            if(s.charAt(i) != s.charAt(s.length() - i - 1))
            {
                System.out.println(s);
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args)
    {
        ValidPalindrome vp = new ValidPalindrome();
        System.out.println(vp.isPalindrome("Marge, let's \"[went].\" I await {news} telegram."));
    }
}
