package TopInterviewQuestions_Easy;

/**
 * ／(•ㅅ•)＼
 *
 * @author Kali Hale
 * @since 2021-11-23
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/97/dynamic-programming/572/
 */

public class BestTimeToBuyAndSell
{
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = -1;
        int sell;
        if(prices.length < 2)
        {
            return 0;
        }
        for(int i = 0; i < prices.length - 1; i++)
        {
            if(prices[i] < prices[i + 1] && buy == -1)
            {
                buy = prices[i];
            }
            if(i > 0 && prices[i] < prices[i - 1] && prices[i] < prices[i + 1])
            {
                buy = prices[i];
            }
            if(i > 0 && prices[i] >= prices[i+1] && prices[i] > prices[i-1] && buy != -1)
            {
                sell = prices[i];
                profit += sell - buy;
                buy = -1;
            }
        }
        if(prices[prices.length - 2] < prices[prices.length - 1] && buy != -1)
        {
            sell = prices[prices.length - 1];
            profit += sell - buy;
        }
        return profit;
    }

    public static void main(String[] args)
    {
        BestTimeToBuyAndSell bttbas = new BestTimeToBuyAndSell();
        System.out.println(bttbas.maxProfit(new int[]{5,2,3,2,6,6,2,9,1,0,7,4,5,0}));
    }
}
