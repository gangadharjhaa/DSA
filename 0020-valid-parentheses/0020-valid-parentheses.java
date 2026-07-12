class Solution {
    public boolean isValid(String s) {
        Stack<Character> s1= new Stack<>();
        
        for( char ch:s.toCharArray()){
            if(ch=='('||ch=='{'||ch=='['){
                s1.push(ch);
            }
            else{
                if(s1.isEmpty()){
                    return false;
                }

                char openBracket = s1.pop();

                int difference= ch - openBracket;

                if(difference!=1 && difference!=2){
                    return false;
                }
            }
        }
        return s1.isEmpty();
    }
}