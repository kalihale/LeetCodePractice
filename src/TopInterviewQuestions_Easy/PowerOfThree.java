package TopInterviewQuestions_Easy;

/** ／(•ㅅ•)＼
 * @author Kali Hale
 * @since 2021-8-12
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/102/math/745/
 * Incorrect
 */

public class PowerOfThree
{
    public boolean isPowerOfThree(int n)
    {
        int ipow3;
        int i = 0;
        do
        {
            ipow3 = (int)Math.pow(3, i);
            if(ipow3 == n)
            {
                return true;
            }
            i += 1;
        }while(ipow3 < n);
        return false;
    }
}
