// here we study aboutbank cases of multithreading
import java.util.Scanner;
class Account
{
int bal;
Account(int b)
{
  bal = b;
}
boolean isSufficientBal(int withdrawBal)
{
 if(bal>withdrawBal)
 {
    return true;
 }
 else {
    return false ;
 }
}

public void withdraw(int withdrawBal){
  bal = bal-withdrawBal;
  System.out.println("withdrawl succesful");
  System.out.println("Current bal is:"+bal);
}
}
class Customer implements Runnable
{
    Account h1; // instance member variable
    String name;
  Customer(Account g1, String s1)
  {
    h1=g1;
    name = s1;
  }
  public void run(){
    
    Scanner s1 = new Scanner(System.in);
    System.out.println(name+ "enter amount to withdraw");   // s1 is used qki ab yha dikhega ki khushi enter amount tyoe krke
    int amt = s1.nextInt();
    synchronized(h1)
    {
    if(h1.isSufficientBal(amt))
    {
        System.out.println(name+ " ");
        h1.withdraw(amt);
    }else {
        System.out.println(name+ "insufficient balance");
    }
    }
  }
}

public class MultiT3 {
    public static void main(String[] args)
    {
     Account a1 = new Account(1000);   // 1000- kitna balance h 
     Customer c1 = new Customer(a1, "khushhi");
     Customer c2 = new Customer(a1, "Kukki");
     Thread t1 = new Thread(c1);
     Thread t2 = new Thread(c2);
     t1.start();
     t2.start();

    }
}
