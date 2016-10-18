import java.util.Hashtable;
import java.util.LinkedList;

public class Franchise {
	private Hashtable<Integer, LinkedList> storesByZip = new Hashtable<Integer, LinkedList>();

	public LinkedList getStores(int zip) {
		return storesByZip.get(zip);
	}
	
	public void addStore(Store store)
	{
		
	}
	
	
	
	
}
