class WordDictionary {
    class Node{
        Node[] children=new Node[256];
        boolean isEnd;
    }
    Node root;
    public WordDictionary() {
        root=new Node();
    }

    public void addWord(String word) {
        Node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
        }
        curr.isEnd=true;
        
    }

    public boolean search(String word) {
        return dfs(word,0,root);
    }
     private boolean dfs(String word, int pos, Node curr) { 
        if (pos == word.length()) {
            return curr.isEnd;
        }
        char ch = word.charAt(pos);
        if (ch != '.') {

            int idx = ch - 'a';

            if (curr.children[idx] == null) {
                return false;
            }

            return dfs(word, pos + 1, curr.children[idx]);
        }

        
        for (int i = 0; i < 26; i++) {

            if (curr.children[i] != null) {

                if (dfs(word, pos + 1, curr.children[i])) {
                    return true;
                }
            }
        }

        return false;
    }
}
