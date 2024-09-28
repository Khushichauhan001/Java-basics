 import java.io.*;
 class FileH1 {
    public static void main(String[] args)  throws IOException
    {
        File f1=new File("Example.class");
        System.out.println(f1.exists());   // tells us that whether this file exits or not 
        System.out.println(f1.canWrite());

     
        f1.createNewFile();

       
        System.out.println(f1.exists());   // tells us that whether this file exits or not 
        System.out.println(f1.canWrite());

    }
}
