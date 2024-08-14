/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/14 23:27
 */
public class P208 {
    class Trie {
        class Node{
            char a;
            Node[] children;
            boolean isEnd;

            public Node(char a){
                this.a = a;
                this.children = new Node[26];
            }
            public Node(){}
        }

        Node root;


        public Trie() {
            root = new Node('a');
        }

        public void insert(String word) {
            Node cur = root;
            for(char ch : word.toCharArray()){
                if(cur.children[ch-'a'] == null){
                    cur.children[ch-'a'] = new Node(ch);
                }
                cur =  cur.children[ch-'a'];
            }
            cur.isEnd = true;
        }

        public boolean search(String word) {
            Node cur = root;
            for(char ch : word.toCharArray()){
                if(cur.children[ch-'a'] == null){
                    return false;
                }
                cur = cur.children[ch-'a'];
            }
            return cur.isEnd;
        }

        public boolean startsWith(String prefix) {
            Node cur = root;
            for(char ch : prefix.toCharArray()){
                if(cur.children[ch-'a'] == null){
                    return false;
                }
                cur = cur.children[ch-'a'];
            }
            return true;
        }
    }

    public void test() {
        Trie trie = new Trie();
        trie.insert("apple");
        trie.search("apple");
        trie.startsWith("app");
    }

    public static void main(String[] args) {
        P208 x = new P208();
        x.test();
    }

}
