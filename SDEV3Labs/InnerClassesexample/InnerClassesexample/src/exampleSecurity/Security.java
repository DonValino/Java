package exampleSecurity;

public class Security {
	
	private String name = "This is a private String";
	
    class InnerSecurity
	{
		public InnerSecurity()
		{
			System.out.println(Security.this.name);
		}
		
	} 
}



