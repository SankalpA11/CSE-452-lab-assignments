package javaapplication20171014;
public class T43th {
     public static void main(String args[])
    {
   
        System.out.println(" b =PROGRAM STARTS....... ");
        ThreadSynchronization th1=new ThreadSynchronization();
        Thread t1=new Thread(th1);
        t1.setPriority(1);
        synchronized(t1)
                {
                    t1.start();
                }
        ThreadSynchronization th2=new ThreadSynchronization();
        Thread t2=new Thread(th2);
        t1.setPriority(9);
        synchronized(t2)
                {
                    t2.start();
                }
                System.out.println(" b =PROGRAM ENDS....... ");
    }  
}
public class ThreadSynchronization implements Runnable
{
    public synchronized void run()
    {
        System.out.println(" STARTING ..........");
        for(int i=0;i<10;i++)
        {
            System.out.println(" Thread "+Thread.currentThread().getName()+" value :"+i);
        }
        System.out.println(" ENDING ..........");
    }
}
