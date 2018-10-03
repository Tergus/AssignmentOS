package producerconsumer;

public class Constant extends Buffer
{
	public static final int BUFFER_SIZE = 5;
	
	private int item = 0;
	
	public Constant(int item)
	{
		this.setSize(item);
	}

	public int getSize() {
		return item;
	}

	public void setSize(int size) {
		this.item = size;
	}
}
