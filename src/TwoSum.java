/** ／(•ㅅ•)＼
 * @author Kali Hale
 * @date 2021-8-12
 * Complete and correct
 */

public class TwoSum
{
    public int[] twoSum(int[] nums, int target) {
        int a;
        int b;
        for(int i = 0; i < nums.length; i++)
        {
            a = nums[i];
            for(int j = i + 1; j < nums.length - 1; j++)
            {
                b = nums[j];
                if(a + b == target)
                {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args)
    {
        TwoSum ts = new TwoSum();
        System.out.println(ts.twoSum(new int[]{2, 7, 11, 15}, 9));
    }
}
