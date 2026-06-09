class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        int i=0;
        StringBuilder sb=new StringBuilder();
        for(int j=0;j<strs[i].length();j++){
            for(int k=1;k<n;k++){
                if(strs[i].isEmpty() ||strs[k].isEmpty()){
                    return "";
                }else if(j>=strs[k].length() || strs[i].charAt(j)!=strs[k].charAt(j)){
                    return sb.toString();
                }
                
            }
            sb.append(strs[i].charAt(j));
            
        }
        return sb.toString();
    }
}