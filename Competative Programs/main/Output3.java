package main;

 class A11 {

	  
	 public int a;
     static int b;
void call(int m, int n)
{
  a +=  m ;
  b +=  n;
} 


}
    
public class Output3 
{
    public static void main(String args[])
    {
    	A11 o1 = new A11();
    	A11 o2 = new A11();   
        o1.a = 0;
        o1.b = 0;
        o1.call(1, 2);
        o2.a = 0;
        o2.call(2, 3);
        System.out.println(o1.a + " " + o2.b);     
    }
}
