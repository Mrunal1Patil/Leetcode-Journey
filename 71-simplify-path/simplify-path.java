class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] parts = path.split("/");

        for(int i=0;i<parts.length;i++){
            String part = parts[i];
            if(part.equals(".") || part.isEmpty()){
                continue;
            }
            else if(part.equals("..")){
               if(!stack.isEmpty()){
                 stack.pop();
               }
            }
            else{
                stack.push(part);
            }

            }
            StringBuilder result = new StringBuilder();
            while(!stack.isEmpty()){
                result.insert(0,"/"+stack.pop());
            }
            if(result.length()>0){
            return result.toString();
        }
        else{
        return "/";
        }
        }
        
    
}