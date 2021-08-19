package TopInterviewQuestions_Easy;

import java.math.BigInteger;

/**
 * ／(•ㅅ•)＼
 *
 * @author Kali Hale
 * @since 2021-08-18
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/97/dynamic-programming/569/
 * Complete and correct!
 */
public class ClimbingStairs
{
    public int climbStairs(int n)
    {
        int ways = 0;
        if(n == 2)
        {
            return 2;
        }
        long k = n;
        while(k > 0)
        {
            BigInteger factn = factorial(n);
            BigInteger factdenom = factorial((long)n - k).multiply(factorial(k));
            factn = factn.divide(factdenom);
            ways += Integer.parseInt(factn.toString());
            k -= 2;
            n -= 1;
        }
        if(k == 0)
        {
            ways += 1;
        }
        return ways;
    }

    public BigInteger factorial(long n)
    {
        if (n == 0)
        {
            return BigInteger.valueOf(1);
        }
        BigInteger ans = BigInteger.valueOf(1);
        for(long i = 1; i <= n; i ++)
        {
            ans = ans.multiply(BigInteger.valueOf(i));
        }
        return ans;
    }

    public static void main(String[] args)
    {
        ClimbingStairs cs = new ClimbingStairs();
        System.out.println(cs.climbStairs(35));
    }
}
