class Countries{
public void GetCountry(){
System.out.println("Get Country");
}
}
class India extends Countries{
	public void CountryCategory(){
		System.out.println("India");
	}
}
class Canada extends Countries{
	public void CountryCategory(){
		System.out.println("Canada");
	}
}
public class Country{
	public static void main (String args[])
	{
		India india=new India();
		india.CountryCategory();
		
		
		
		Canada canada=new Canada();
		canada.CountryCategory();
	}
}
	
	