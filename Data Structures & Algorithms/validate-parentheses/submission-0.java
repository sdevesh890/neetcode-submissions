class Solution {
    public boolean isValid(String s) {
         Stack<Character> stack = new Stack<>();

        for(char ch:s.toCharArray())
        {
            if(ch==')')
            {
                if(stack.isEmpty())
                return false;

                if(stack.peek()!='(')
                return false;

                stack.pop();
            } else if(ch==']')
            {
                if(stack.isEmpty())
                return false;

                if(stack.peek()!='[')
                return false;

                stack.pop();
            }else if(ch=='}')
            {
                if(stack.isEmpty())
                return false;

                if(stack.peek()!='{')
                return false;

                stack.pop();
            }else{
                stack.push(ch);
            }
        }

        if(!stack.isEmpty()) return false;

        return true;
    }
}
