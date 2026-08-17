class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
             return new ArrayList<>();
        }
       String p="";
       return helper(p,digits); 
    }
    List<String> helper(String p,String up){
        if(up.isEmpty()){
            List<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        String[] mapping = {
            "", "", "abc", "def",
            "ghi", "jkl", "mno",
            "pqrs", "tuv", "wxyz"
        };
        List<String> list=new ArrayList<>();
        int digit=up.charAt(0)-'0';
        String Letter=mapping[digit];
        for(int i=0;i<Letter.length();i++){
            char ch=Letter.charAt(i);
            list.addAll(helper(p+ch,up.substring(1)));
        }
        return list;
    }
}
