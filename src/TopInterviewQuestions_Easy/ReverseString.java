package TopInterviewQuestions_Easy;

/**
 * ／(•ㅅ•)＼
 *
 * @author Kali Hale
 * @since 2021-08-19
 * Complete and correct
 */
public class ReverseString
{
    public void reverseString(char[] s)
    {
        char x;
        for(int i = 0; i < s.length / 2; i++)
        {
            x = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = x;
        }
    }
}
