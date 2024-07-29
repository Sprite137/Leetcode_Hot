public class P208 {
    class Trie {
        class TrieNode{
            boolean isWord;
            TrieNode[] children;


            public TrieNode(){
                children = new TrieNode[26];
            };

        }

        TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

        public void insert(String word) {
            TrieNode node  = root;
            for(char ch : word.toCharArray()){
                if(node.children[ch-'a'] == null){
                    node.children[ch-'a'] = new TrieNode();
                }

                node = node.children[ch-'a'];
            }
            node.isWord = true;
        }

        public boolean search(String word) {
            TrieNode node  = root;
            for(char ch : word.toCharArray()){
                if(node.children[ch-'a'] == null){
                    return false;
                }
                node = node.children[ch-'a'];
            }
            return node.isWord;
        }

        public boolean startsWith(String prefix) {
            TrieNode node  = root;
            for(char ch : prefix.toCharArray()){
                if(node.children[ch-'a'] == null){
                    return false;
                }
                node = node.children[ch-'a'];
            }
            return true;
        }
    }

    public void test() {
        Trie trie = new Trie();
        trie.insert("apple");
        System.err.println(1);
    }

    public static void main(String[] args) {
        P208 x = new P208();
        x.test();
    }
}
