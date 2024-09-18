class Exc_handling {
    public static void main(String[] args) {
        String s1 = null;
        try{
        System.out.println(s1.length());  // gives error
        }catch(NullPointerException n1)
        {
          System.out.println(n1.getMessage());
        }
        System.out.println("A");
        try{
            System.out.println(5/0);  // gives error
        }
        catch(ArithmeticException e1){             // here we use this bcz we are handling errors by ourself qki agr compiler khud krega toh error aajyga 
              System.out.println(e1.getMessage());
        }
        

    }
}
