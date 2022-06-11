package TopInterviewQuestions_Easy;

import java.util.ArrayList;

/**
 * ／(•ㅅ•)＼
 *
 * @author Kali Hale
 * @since 2021-11-23
 */
public class IntersectionOfTwoArrays
{
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> intersection = new ArrayList<>();
        for(int i : nums1)
        {
            for(int j : nums2)
            {
                if(i == j)
                {
                    intersection.add(j);
                }
            }
        }
        int[] result = new int[intersection.size()];
        for(int i = 0; i < intersection.size(); i++)
        {
            result[i] = intersection.get(i);
        }
        return result;
    }
}
