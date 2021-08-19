package TopInterviewQuestions_Easy;

/**
 * ／(•ㅅ•)＼
 *
 * @author Kali Hale
 * @since 2021-08-17
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/96/sorting-and-searching/774/
 * Complete and correct
 */
public class FirstBadVersion
{
    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

//    public class Solution extends VersionControl {
//        public int firstBadVersion(int n) {
//            if(isBadVersion(n/2))
//            {
//                return search(1, n/2);
//            }
//            else
//            {
//                return search(n/2, n);
//            }
//        }
//        public int search(int lower, int upper)
//        {
//            int mid = lower + ((upper - lower)/2);
//            if(isBadVersion(mid) && !isBadVersion(mid - 1))
//            {
//                return mid;
//            }
//
//            if(isBadVersion(mid))
//            {
//                return search(lower, mid - 1);
//            }
//            else
//            {
//                return search(mid + 1, upper);
//            }
//        }
//    }
}
