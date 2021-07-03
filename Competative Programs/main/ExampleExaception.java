package main;


class Base22 extends Exception {}
class Derived22 extends Base22  {}

public class ExampleExaception {

  public static void main(String args[]) {
   // some other stuff
   try {
       // Some monitored code
       throw new Derived22();
    }
    catch(Base22 b)     { 
       System.out.println("Caught base class exception"); 
    }
    catch(Derived22 d)  { 
       System.out.println("Caught derived class exception"); 
    }
  }
} 