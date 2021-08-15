/** ／(•ㅅ•)＼
 * @author Kali Hale
 * @date 2021-8-12
 * Incomplete, incorrect
 */

import java.util.Arrays;

public class MoveZeroes
{
    public void moveZeroes(int[] nums)
    {
        int x;
        for(int i = 0; i < nums.length - 1; i++)
        {
            if(nums[i] == 0)
            {
                x = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = x;
            }
        }
    }

    public static void main(String[] args)
    {
        int[] ints = new int[] {0, 1, 0, 3, 12};
        MoveZeroes mz = new MoveZeroes();
        mz.moveZeroes(ints);
        System.out.println(Arrays.toString(ints));
    }
}
