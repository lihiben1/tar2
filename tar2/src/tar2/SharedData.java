package tar2;

import java.util.ArrayList;

/**SharedData class provides Data by making Getter and Setter
 * @author lihib
 * 
 */
public class SharedData 
{
	ArrayList<Integer> array = new ArrayList<>();  
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/** constructor of the class SharedDate
	 * @param array         
	 * @param b
	 */
	public SharedData(ArrayList<Integer> array,int b)
	{
		
		this.array = array;
		this.b = b;
	}

	public boolean[] getWinArray() 
	{
		return winArray;
	}

	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}

	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	public int getB() 
	{
		return b;
	}

	public boolean getFlag() 
	{
		return flag;
	}

	public void setFlag(boolean flag) 
	{
		this.flag = flag;
	}

}
