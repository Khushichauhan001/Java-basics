// import java.util.LinkedList;

import java.util.*;
class Collection2 {
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        l1.addFirst("Khushi");
        l1.addLast("Chauhan");
        l1.add(1,"college");
        System.out.println(l1.getFirst());
        System.out.println(l1.getLast());
        System.out.println(l1.get(1));


        Stack s1 = new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        System.out.println(s1.search(30));
        

    }
}
