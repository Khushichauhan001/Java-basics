 import java.util.*;
 class Cursors {
    public static void main(String[] args) {
        Vector v1 = new Vector();
        v1.add("A");
        v1.add("B");
        v1.add("C");
        v1.add("D");
        v1.add("E");

        ListIterator l1 = v1.listIterator();
        while (l1.hasNext()) {
            System.out.println(l1.next());
        }

        while(l1.hasPrevious())
        {
            System.out.println(l1.previous());   // jata bhi h or aata bhi h 
        }


        // Iterator e1 = v1.iterator();    // iterator function
        // while(e1.hasNext())      
        // {
        //     String s1 = (String)e1.next();
        //     if(s1=="D")
        //     {
        //         e1.remove();   // function of iterator
        //     }
        //     else{
        //         System.out.println(s1);
        //     }
           
        // }



        // Enumeration k1 = v1.elements();    // k1 can access 2 function (hasMoreElements , and , nextElement)
        // while (k1.hasMoreElements()) {
        //     System.out.println(k1.nextElement());  // help to print the element
            
        // }
    }
}
