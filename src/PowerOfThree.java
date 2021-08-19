/** ／(•ㅅ•)＼
 * @author Kali Hale
 * @since 2021-8-12
 * Complete and correct
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
