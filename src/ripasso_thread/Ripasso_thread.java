/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ripasso_thread;

/**
 *
 * @author informatica
 */
public class Ripasso_thread {

     public static void main(String[] args) 
     {
            Storage st = new Storage();
            Counter c = new Counter(st);
            Printer p = new Printer(st);
            new Thread( c,"Counter").start();  
            new Thread( p,"Printer").start();   
      }
    
}
