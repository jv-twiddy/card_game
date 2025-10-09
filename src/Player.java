package src;

public class Player extends Thread{
    
    private volatile boolean done = false;

    @Override
    public void run (){
        while (!done) {
            try {
                Thread.sleep(10); 
                 System.out.println("AAAAAAAAAA");
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
                break;
            }
           
        }
    }

    public void stopThread() {
        System.out.println("Stopping thread");
        this.done = true;
    }
}
