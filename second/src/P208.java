public class P208 {
    class Trie {
        class TrieNode{
            boolean isWord;
            TrieNode children[];

            public TrieNode(){
                children = new TrieNode[26];
            }
        }


        TrieNode root;

        public Trie() {
            root = new TrieNode();

        }

        public void insert(String word) {
            TrieNode node = root;
            for(char a:word.toCharArray()){
                if(node.children[a-'a'] == null){
                    node.children[a-'a'] = new TrieNode();
                }
                node = node.children[a-'a'];
            }
            node.isWord=true;

        }

        public boolean search(String word) {
            TrieNode node = root;
            for(char a: word.toCharArray()){
                if(node.children[a-'a'] == null){
                    return false;
                }
                node = node.children[a-'a'];
            }
            return node.isWord;
        }

        public boolean startsWith(String prefix) {
            TrieNode node = root;
            for(char a: prefix.toCharArray()){
                if(node.children[a-'a'] == null){
                    return false;
                }
                node = node.children[a-'a'];
            }
            return true;
        }
    }
}
