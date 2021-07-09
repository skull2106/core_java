public class Thread_isalive extends Thread {
	public void run()
	{
		System.out.println(Thread.currentThread().getId()+" thread body");
		try
		{
			Thread.sleep(500);
		}
		catch(InterruptedException ie) {}
			System.out.println(Thread.currentThread().getId()+" is done");
	}
	public static void main(String[] args)
	{
		Thread_isalive t1 = new Thread_isalive();
		Thread_isalive t2 = new Thread_isalive();
		t1.start();
		t2.start();
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
	}
}
