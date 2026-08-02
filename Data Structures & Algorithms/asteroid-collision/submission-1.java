class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack =new Stack<>();
        List<Integer> list=new ArrayList<>();
        for(int i:asteroids){
            boolean destroid=false;
            
                while(!stack.isEmpty() && stack.peek()>0 && i<0){
                    if(stack.peek()<-i){
                        stack.pop();
                    }else if(stack.peek()==-i){
                        stack.pop();
                        destroid=true;
                        break;
                    }else{
                        destroid=true;
                        break;
                    }
                }    
                if(!destroid){
                stack.push(i);
            
            }
            
        } 
        int[] ans=new int[stack.size()];
        
        for (int i = 0; i < stack.size(); i++) {
            ans[i] = stack.get(i);
            }
        return ans;
    }
}