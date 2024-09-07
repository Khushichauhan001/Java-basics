// we donot need to write super(), but if we want to pass some arguments and Nokia1 has private members (x,y) then super helps to access them 


class Nokia1{
    private int x,y;
    Nokia1(int p, int q)
    {
        x=p; 
        y=q;
       System.out.println("Parents consructor executed");
    }
    void f1()
    {
        System.out.println("Parent function 1 executed");
    }
    void f2()
    { 
        System.out.println("Parent function 2 executed");
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
        super(6,7);
        System.out.println("child's constructor executed");
    }
}


public class SuperInherit {
    public static void main(String[] args) {
        Nokia2 n1 = new Nokia2();
        
    }
}