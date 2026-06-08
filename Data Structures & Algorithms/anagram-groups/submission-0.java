class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            int[] count=new int[26];
            for(char c:str.toCharArray()){
                count[c-'a']++;
            }
            StringBuilder sb=new StringBuilder();
            for(int num:count){
                sb.append("#").append(num);
            }
            map.putIfAbsent(sb.toString(), new ArrayList<>());
            map.get(sb.toString()).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
