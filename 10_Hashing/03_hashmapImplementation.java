import java.util.HashMap;
import java.util.LinkedList;

public class practice {
    static class HashMap<k,v> // generics
    {
        private class Node {
            k key;
            v value;

            public Node(k key, v value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // n nodes
        private int N; // N buckets
        private LinkedList<Node> buckets[]; // N = buckets.length

        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i = 0; i < 4; i++)
                this.buckets[i] = new LinkedList<>();
        }


        private int hashFunction(k key) {
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        private int searchInLL(k key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key)
                    return i;
            }
            return -1;
        }

        private void rehash() {
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N * 2];

            for (int i = 0; i < N * 2; i++)
                buckets[i] = new LinkedList<>();

            for (int i = 0; i < oldBucket.length; i++) {
                LinkedList<Node> ll = oldBucket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(k key, v value) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1)// key doesn't exist
            {
                buckets[bi].add(new Node(key, value));
                n++;
            } else {
                Node node = buckets[bi].get(di);
                node.value = value;
            }

            double lambda = (double) n / N;
            if (lambda > 2.0) {
                // rehashing
                rehash();
            }
        }

        public v get(k key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1)// key doesn't exist
                return null;
            else {
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }

        public boolean containsKey(k key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if (di == -1)// key doesn't exist
                return false;
            else
                return true;
        }

        public v remove(k key){
            int bi = hashFunction(key);
            int di = searchInLL(key,bi);

            if(di == -1)// key doesn't exist
                return null;
            else{
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }

        public boolean isEmpty(){
            return n == 0;
        }
    }
     public static void main(String[] args) {

        HashMap<String,Integer> map = new HashMap<>();
        map.put("India",120);
        map.put("Us",20);
        map.put("China",150);
     }
}

