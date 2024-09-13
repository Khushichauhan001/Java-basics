// super keyword is used to access the parent variables

class Example
   {
      public int x  , y;
      void f1(int x , int y)
      {
        this.x = x;
        this.y = y;
      }     
      void display()
      {
        System.out.println(x);
        System.out.println(y);
      }
    }
class Example1 extends Example             // here we have variable of EXamples also and khud k bhi x , h      SO IF we want to access the variable of f3() the n use this.x and if we want to access the variables of parent (Example) then use super.x keyyword
{
    int x , y;
    void f3(int x , int y)
    {
        super.x = x;
        super.y = y;
    }
    void f4()
    {
        System.out.println(this.x);   // isme child bala hi print hoga (can be write it with this keyword) or hmne value nai di kuch bhi toh islie ye 0 print krega
        System.out.println(super.y);   // value will come 0
    }
}
 class Superkey
 {
    public static void main(String[] args) {
        Example1 e1 = new Example1();
        e1.f3(7,9);
        e1.f4();

    }
 }
 
