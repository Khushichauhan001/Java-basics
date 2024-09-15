 import java.util.Scanner;
 class Account
 {
    int bal;
     Account(int b)
     {
        bal = b;
     }

    boolean  isSufficientBal(int w){
        if(bal>w){
           return true;
        }
        else 
        {
            return false;
        }
     }
 void withdraw(int amt, String g1)
 {
   bal = bal-amt;
   System.out.println(g1+ "transaction successful"+amt);
   System.out.println(g1+ "Current Balance"+bal);
 }

}

class Customer implements Runnable
{
    String m1;
    Account x1;   // it is like ki int x ; but here we enter account o ject so that we can store the large amount of data
    Customer(Account j1,String h1)  // here also bcz x1 is of account type and we have to pass value of x1 in customer so 
    {
      x1=j1;
      m1=h1;
    }
    public void run()
    {
      Scanner s1= new Scanner(System.in) ;
      synchronized(x1)
      {
      System.out.println("enter amount to withdraw for amit"+m1+":");
      int amt = s1.nextInt();
      if(x1.isSufficientBal(amt))
      {
        x1.withdraw(amt,m1);
      }
      else{
        System.out.println("Insufficien balance");
      }
    }
    }


}
 
 class ThreadSyn {
    public static void main(String[] args) {
        
   Account a1 = new Account(5000);
   Customer c1 = new Customer(a1,"AMIT");
   Customer c2 = new Customer(a1,"SUMIT");
   Thread t1 = new Thread(c1);
   Thread t2 = new Thread(c2);
   t1.start();
   t2.start();

    }
}
