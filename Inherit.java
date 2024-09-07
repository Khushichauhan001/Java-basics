class Nokia1{
    int x,y;
    void f1()
    {
        System.out.println("Parent function 1 executed");
    }
    void f2()
    { 
        System.out.println("Parent function 2 executed");
     }
     Nokia1()
     {
        System.out.println("Parents consructor executed");
     }
}

class Nokia2 extends Nokia1{
    int z;
    void f3()
    {
        System.out.println("child function 1 executed");
    }
    Nokia2()
    {
        System.out.println("child's constructor executed");
    }
}


public class Inherit {
    public static void main(String[] args) {
        Nokia2 n1 = new Nokia2();
        // n1.f1();         // now we can access the properties of nokia1 also
        // n1.f2();
        // n1.f3();
    }
}
