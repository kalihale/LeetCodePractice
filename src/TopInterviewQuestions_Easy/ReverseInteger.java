package TopInterviewQuestions_Easy;

/**
 * ／(•ㅅ•)＼
 *
 * @author Kali Hale
 * @since 2021-08-19
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/880/
 * Complete and correct
 */

public class ReverseInteger
{
    public int reverse(int x)
    {
        char y;
        String xstring = String.valueOf(x);
        char[] xarr = xstring.toCharArray();

        for(int i = 0; i < xarr.length/2; i++)
        {
            y = xarr[i];
            xarr[i] = xarr[xarr.length - i - 1];
            xarr[xarr.length - i - 1] = y;
        }

        xstring = "";

        if(x < 0)
        {
            xstring = xstring.concat("-");
        }

        for (char c : xarr)
        {
            xstring = xstring.concat(String.valueOf(c));
        }

        if(x < 0)
        {
            xstring = xstring.substring(0, xstring.length() - 1);
        }

        long z = Long.parseLong(xstring);

        if(z > Math.pow(2, 31) - 1 || z < -Math.pow(2, 31))
        {
            return 0;
        }
        else
        {
            return (int) z;
        }
    }

    public static void main(String[] args)
    {
        ReverseInteger ri = new ReverseInteger();
        System.out.println(ri.reverse(-123));
    }
}
