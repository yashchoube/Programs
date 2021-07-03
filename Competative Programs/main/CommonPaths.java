package main;


public interface CommonPaths {    String getName();}
interface Mammal {  String getName();}
abstract class otter implements Mammal, CommonPaths {
    
}

//public class CommonPaths extends otter{
//    public static void main(String[] args) {
//        otter commonPaths= new CommonPaths();
//        
//        System.out.println(commonPaths.getName());
//    }
//
//}



