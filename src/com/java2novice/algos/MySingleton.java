package com.java2novice.algos;
 
public class MySingleton {
 
    private static MySingleton myObj;
     
    static{
        myObj = new MySingleton();
    }
    // this private construct prevent others to create object.
    private MySingleton(){
     
    }
     
    public static MySingleton getInstance(){
        return myObj;
    }
     
    public void testMe(){
        System.out.println("Hey.... it is working!!!");
    }
     
    public static void main(String a[]){
        MySingleton ms = getInstance();
        MySingleton ms1 = getInstance();
        ms.testMe();
        ms1.testMe();
    }
}