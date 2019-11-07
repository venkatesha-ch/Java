import java.util.*;

class multi<T, U>
{
    T ob1;
    U ob2;
    multi(T x,U y)
    {
    ob1 = x;
    ob2 = y;
    }
    
    T get()
    {
    return ob1;
    }
    
    U get1()
    {
    return ob2;
    }
    
    }
    
class maindemo
{
public static void main(String arg[])
{
    multi<Integer, Character> ob = new multi<Integer, Character>(100,'h');
    System.out.println(ob.get() + "  " +ob.get1());
    }
    }    
