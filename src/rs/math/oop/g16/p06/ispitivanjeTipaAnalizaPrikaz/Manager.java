package rs.math.oop.g16.p06.ispitivanjeTipaAnalizaPrikaz;

public class Manager extends Zaposleni
{
  double bonus;
	
	public void setBonus( double bonus )
	{
		this.bonus = bonus;
	}

	public Manager( String n, double s, double b )
	{
		super( n, s );
		bonus = b;
	}
	
}
