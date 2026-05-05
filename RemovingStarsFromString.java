class Solution {
    public String removeStars(String s) {
        Deque<Character> stack  = new ArrayDeque<>();
        StringBuilder str = new StringBuilder();
        int i = 0;
        while(s.length()>i)
        {
            
            if(s.charAt(i) == '*')
            {
                if(stack.isEmpty())
                    continue;

                stack.pop();
            }
            else
            {
                stack.push(s.charAt(i));
            }
        i++;
        }
        for(char item : stack)
        {
            str.append(item);
        }
        return str.reverse().toString();


    }
}
