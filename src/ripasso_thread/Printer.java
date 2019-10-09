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
class Printer implements  Runnable  {

    Storage s;

    Printer(Storage s) 
    {
       this.s = s;
    }

    @Override
    public void run() 
    {
         int counter = 0;    
            while (true) 
         {
             counter=s.get();
            System.out.println(counter); 
            
         }
    }
}
