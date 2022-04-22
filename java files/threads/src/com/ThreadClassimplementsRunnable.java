package com;

public class ThreadClassimplementsRunnable {
	public static int myCount = 0;
    public ThreadClass(){
         
    }


	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(ThreadClass.myCount <= 5){
            try{
                System.out.println("Expl Thread: "+(++ThreadClass.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Starting Main Thread...");
       ThreadClass mrt = new ThreadClass();
        Thread t = new Thread(mrt);
        t.start();
        while(ThreadClass.myCount <= 5){
            try{
                System.out.println("Main Thread: "+(++ThreadClass.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");


	}

}
