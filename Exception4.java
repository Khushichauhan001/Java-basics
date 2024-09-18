import java.io.*;

 class Exception4 {
    public static void main(String[] args) throws IOException,ClassNotFoundException // ya overall Exception likh do bs // java ready rho IOexception ya koi bhi or error aa skti h 
    {
        System.out.println("A");
        throw new IOException();   // it is inside thee (*/IOException) package so firstly have to import

    }
}
