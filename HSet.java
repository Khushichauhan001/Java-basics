import java.util.*;
class HSet {
public static void main(String[] args) {
     HashSet h1 = new HashSet ();
     h1.add("C");
     h1.add("C++");
     h1.add("java");
     h1.add("Python");
     System.out.println(h1);   // jis sequence m rkha usme ni aayga wo sequence change kr lega (insertion order not maintain)

}
}