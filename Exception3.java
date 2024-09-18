public class Exception3 {
    public static void main(String[] args) {
        int cb = 10000;
        int wb = 4000;
        try{
            if(cb<wb){
                throw new ArithmeticException("insufficient balance ") ;   // to set the error message  
                // we throw bcz compiler donot know all the business exception and cannot handle them 
            }
        cb = cb-wb;
        System.out.println("transaction successful");

        System.out.println("Current Balance is:"+cb);
        }
        catch(ArithmeticException e1){
          System.out.println(e1.getMessage());
          System.out.println("current bal is:"+cb);
        }
    }
}
