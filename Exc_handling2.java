 // see notes of exception handling
 
 class Exc_handling2 {
    public static void main(String[] args) {
        
        System.out.println("A");
        String s1 = null;
        try {
            System.out.println(s1.length());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("B");
        }
        
    }
}
