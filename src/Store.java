

public class Store {
	
	private double lat;					//latitude
	private double lon;					//longitude
	private boolean healthy;			//healthy is true, junk is false
	private String franchise_Name;		//name of franchise
	private int zip_Code;				//zip code
	private String street_Address;		//street address
	
	public Store(double la, double lo, boolean health, String f_Name, int zip, String s_Address)
	{
		
		this.setLat(la);
		this.setLon(lo);
		this.setHealthy(health);
		this.setFranchise_Name(f_Name);
		this.setZip_Code(zip);
		this.setStreet_Address(s_Address);
		
	}
	
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLon() {
		return lon;
	}
	public void setLon(double lon) {
		this.lon = lon;
	}
	public boolean isHealthy() {
		return healthy;
	}
	public void setHealthy(boolean healthy) {
		this.healthy = healthy;
	}
	public String getFranchise_Name() {
		return franchise_Name;
	}
	public void setFranchise_Name(String franchise_Name) {
		this.franchise_Name = franchise_Name;
	}
	public int getZip_Code() {
		return zip_Code;
	}
	public void setZip_Code(int zip_Code) {
		this.zip_Code = zip_Code;
	}
	public String getStreet_Address() {
		return street_Address;
	}
	public void setStreet_Address(String street_Address) {
		this.street_Address = street_Address;
	}
	
}