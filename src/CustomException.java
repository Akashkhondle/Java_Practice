import java.util.*;

//checked Exception
class UserdefinedException extends Exception{
    UserdefinedException(String m)
    {
        super(m);
    }
}

//unchecked exception - runtime exception

class WrongCredentials extends RuntimeException{
    WrongCredentials(String m)
    {
        super(m);
    }
}
public class CustomException
{


    public static void main(String[] args) {
        System.out.println("Hello World");





        try{
            //throw new ArrayIndexOutOfBoundsException("manually throwing exception");
            // int a = 5 /0;
            //System.out.println("HELLO");
            throw new UserdefinedException("This is manuaaly created exception");

        }catch(ArithmeticException e){
            System.out.println("Handledthe exception");

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

        throw new WrongCredentials("This is unchecked custom exception");
        //System.out.println("after");


    }
}
