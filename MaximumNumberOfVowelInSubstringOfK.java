class Solution {
    public boolean isVowel(char ch)
    {

     return (ch == 'a'||ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    public int maxVowels(String s, int k) {
        
        int max =0;
        int count = 0;

        int i = 0;

        while(i<s.length())
        {

            char ch = s.charAt(i);

            if(i>= k)
            {
                if(isVowel(s.charAt(i-k)))
                    count--;
            }
            if(isVowel(ch))
            {
                count++;
            }

            if(count == k)
                return k;
            max = Math.max(max,count);

            i++;
        }

        return max;
    }
}
