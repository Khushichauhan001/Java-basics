class Demo {
    int x , y;
    Demo(int p , int q)
    {
    x=p;
    y=q;
    }
    Demo(int a)
    {}
   Demo()
   {}
 }
 class Construct 
 {
     public static void main(String[] args)
 {
    Demo d1 = new Demo(5,6);// call 1 automatically
    Demo d2 = new Demo(7,9);
    Demo d3 = new Demo();        // call 3rd
    Demo d4 = new Demo(6);  // constructor automaicLy cAlls the 2nd one
 
 }
}
