class Solution {

    public boolean vowel(char ch)
    {
        ch = Character.toLowerCase(ch);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return true;
        return false;
    }
    public String reverseVowels(String s) {
        int i = 0;

        char[] arr = s.toCharArray();

        int j = arr.length-1;

        while(i<j)
        {
            {
                i++;
            }
            {
                j--;
            }
            if(i<j)
            {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
                i++;
            }
        }

        return new String(arr);
    }
}
