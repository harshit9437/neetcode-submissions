class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<order.length();i++){
            map.put(order.charAt(i),i);
        }
        int i=0;
        int j=1;
        while(i<words.length-1){
            int k=0;
            while(k<words[i].length() &&
                     k<words[j].length()){
            char a=words[i].charAt(k);
            char b=words[j].charAt(k);
            if(map.get(a)<map.get(b)){
                break;
            }
            if(map.get(a)>map.get(b)){
                return false;
            }
            k++;
            }
            if(k==words[j].length() && 
            words[i].length()>words[j].length()){
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}