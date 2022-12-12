package rs.math.oop.g16.p06.ispitivanjeTipaAnalizaPrikaz;

public class Pair<T>
{
	private T prvi;
	private T drugi;
	
	// Generic constructor
	public Pair(T prvi, T drugi )
	{
		this.prvi = prvi;
		this.drugi = drugi;
	}
	
	// Generic methods
	public void setPrvi( T prvi )
	{
		this.prvi = prvi;
	}
	
	public void setDrugi( T drugi )
	{
		this.drugi = drugi;
	}
	
	public T getPrvi()
	{
		return prvi;
	}
	
	public T getDrugi()
	{
		return drugi;
	}
	
	@Override
	public String toString()
	{
		return "(" + prvi + ", " + drugi + ")";
	}
}
