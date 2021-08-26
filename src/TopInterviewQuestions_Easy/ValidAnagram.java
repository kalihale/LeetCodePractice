package TopInterviewQuestions_Easy;

import java.util.HashMap;

/**
 * ／(•ㅅ•)＼
 *
 * @author Kali Hale
 * @since 2021-08-25
 * Complete and correct
 */
public class ValidAnagram
{
    public boolean isAnagram(String s, String t)
    {
        if(s.length() != t.length())
        {
            return false;
        }

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for(int i = 0; i < sChars.length; i++)
        {
            if(!sMap.containsKey(sChars[i]))
            {
                sMap.put(sChars[i], 1);
            }
            else
            {
                sMap.put(sChars[i], sMap.get(sChars[i]) + 1);
            }

            if(!tMap.containsKey(tChars[i]))
            {
                tMap.put(tChars[i], 1);
            }
            else
            {
                tMap.put(tChars[i], tMap.get(tChars[i]) + 1);
            }
        }
        return sMap.equals(tMap);
    }

    public static void main(String[] args)
    {
        ValidAnagram va = new ValidAnagram();
        System.out.println(va.isAnagram("anagram", "nagaram"));
    }
}
