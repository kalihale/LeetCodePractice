package TopInterviewQuestions_Easy;

import java.util.Arrays;

/** ／(•ㅅ•)＼
 * @author Kali Hale
 * @since 2021-8-12
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/
 * Complete and correct
 */

public class RemoveDuplicates
{
    public int removeDuplicates(int[] nums)
    {
        int x = 0;
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[x] != nums[i])
            {
                x++;
                nums[x] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return x + 1;
    }

    public static void main(String[] args)
    {
        RemoveDuplicates rd = new RemoveDuplicates();
        System.out.println(rd.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}
