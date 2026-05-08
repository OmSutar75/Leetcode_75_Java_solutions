class Solution {
    public String decodeString(String s) {

        Deque<String> stack = new ArrayDeque<>();
        Deque<Integer> counts = new ArrayDeque<>();

        String res = ;
        int i = 0;

        while (i < s.length()) {

            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {

                int count = 0;

                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    count = count * 10 + (s.charAt(i) - '0');
                    i++;
                }

                counts.push(count);

            } 
            
            else if (ch == '[') {

                stack.push(res);
                res = ;

                i++;
            } 
            
            else if (ch == ']') {

                String prev = stack.pop();
                int count = counts.pop();

                StringBuilder temp = new StringBuilder(prev);

                for (int j = 0; j < count; j++) {
                    temp.append(res);
                }

                res = temp.toString();

                i++;
            } 
            
            else {

                res += ch;
                i++;
            }
        }

        return res;
    }
}
