/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ripasso_thread;

/**
 *
 * @author informaticas
 */
class Counter implements  Runnable {
       Storage s;
 
    public Counter(Storage s) {
        this.s=s;
    }

    @Override
    public void run() {
        for(int i = 0 ; i < 50000000; i++){
            s.set(i);
        }
        
    }
}
 
    

