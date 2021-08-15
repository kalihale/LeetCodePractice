/** ／(•ㅅ•)＼
 * @author Kali Hale
 * @date 2021-8-14
 * Complete, correct
 */

public class FirstUniqueCharacter
{
    public int firstUniqChar(String s) {
        boolean[] repeat = new boolean[s.length()];
        for(int i = 0; i < s.length(); i++)
        {
            if(!repeat[i])
            {
                for(int j = i + 1; j < s.length(); j++)
                {
                    if(s.charAt(i) == s.charAt(j))
                    {
                        repeat[i] = true;
                        repeat[j] = true;
                    }
                }
            }
        }
        for(int i = 0; i < repeat.length; i++)
        {
            if(!repeat[i])
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        FirstUniqueCharacter fuc = new FirstUniqueCharacter();
        System.out.println(fuc.firstUniqChar("leetcode"));
    }
}
