// Basic operations using collection framework

import java.util.LinkedList;

public class practice {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.addFirst("aj");
        list.addFirst("Hi");
        list.addLast("bye");
        System.out.println(list);
        System.out.println(list.size());
        list.removeFirst();
        list.removeLast();
        list.remove(2);
        }
    }

