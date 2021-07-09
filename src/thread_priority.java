
public class thread_priority extends Thread{
public void run()
{
	Thread.currentThread().setName("HAHAH");
	System.out.println(Thread.currentThread().getName()+"Thread's priority is"+Thread.currentThread().getPriority());

}
public static void main(String args[])
{
	thread_priority t1 = new thread_priority();
	thread_priority t2 = new thread_priority();
	t1.setPriority(MAX_PRIORITY);
	t2.setPriority(MIN_PRIORITY);
	t1.start();
	t2.start();
}
}
