package durgaMultiThreading;
import java.util.concurrent.locks.*;

public class reentrantLockDemo1 
{
	public static void main(String[]args)
	{
		ReentrantLock l=new ReentrantLock();
		l.lock();
		l.lock();
		System.out.println(l.isLocked());
		System.out.println(l.isHeldByCurrentThread());
		System.out.println(l.getQueueLength());
		l.unlock();
		System.out.println(l.getHoldCount());
		System.out.println(l.isLocked());
		l.unlock();
		System.out.println(l.isLocked());
		System.out.println(l.isFair());
	}
}
