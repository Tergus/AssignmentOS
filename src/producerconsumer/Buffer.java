package producerconsumer;

import java.util.concurrent.Semaphore;

public class Buffer
{
	private Constant[] buffer;
	
	private int nextIn;
	private int nextOut;
	
	private Semaphore mutex;
	private Semaphore full;
	private Semaphore empty;
	
	public Buffer()
	{

	}
	
	public void insert_item(Constant item)
	{
		
	}
}
