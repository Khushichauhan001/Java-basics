interface i1
 {
    int x = 6;
    void f1();
    
    static void  f2()       // but static func cannot be inherit in the class but can be over ride
    {
        System.out.println(x);
    }
}
interface i2 extends i1
{
   int y = 2;
   void f3();
}
class c1 implements i2
{

    static void  f2()       // but static func cannot be inherit in the class but can be over ride
    {
      int x = 8;
        System.out.println(x);
    }
  public void f1()
    {

    }
    public void f3()
    {

    }
  
}
class Interface 
{
   public static void main(String[] args) {
    //i2.f2();     gives error 
      c1.f2();        // gives over-ride bali value
   //  c1 C1 =new c1();      // c1 is class name
   //  C1.f2();
   //   System.out.println(C1.y);
    // i1.f2();          // x= 6;
   }
}