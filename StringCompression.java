class Solution {
    public int compress(char[] chars) {

        if(chars.length <= 1)
            return 1;

        StringBuilder ans = new StringBuilder();

        int count =1;
        char prev  = chars[0];
        int i = 1;
        while(i<chars.length)
        {
            if(prev == chars[i])
            {
                count++;
            }
            else
            {
                ans.append(prev);
                if(count > 1)
                {
                    ans.append(String.valueOf(count));
                }
                count = 1;
                prev = chars[i];
            }

            i++;
        }
        ans.append(prev);
        if(count>1)
        {   
            ans.append(count);
        }
        
        ans.getChars(0,ans.length(),chars,0);
        return ans.length();
    }
}
