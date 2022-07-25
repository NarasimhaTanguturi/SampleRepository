package Demo;

public class MultiThreading extends Thread implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread multithread1 = new Thread("Running 1st thread");
Thread multithread2 = new Thread("Running 2nd thread");
multithread1.start();
multithread2.start();

boolean thread2AliveStatus = multithread2.isAlive();
System.out.println(thread2AliveStatus);

System.out.println(multithread1.toString());

System.out.println(multithread1.getName());

boolean thread1AliveStatus = multithread1.isAlive();
System.out.println(thread1AliveStatus);
System.out.println(multithread2.getName());
System.out.println(multithread1.getPriority());

	}
	@Override
	public void run() {
		
	}
}