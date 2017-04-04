
public class LicenseKeys {
	
	private static void licenseKey(String S, int K) {
		// TODO Auto-generated method stub
		//replacing - with nothing
		 S = S.replaceAll("[-]", "");
		 //converting every letter to uppercase
		    S = S.toUpperCase();

		    StringBuilder sb = new StringBuilder();
		    sb.append(S);
          //inserting - after every K characters
		    int i=sb.length()-K;
		    while(i>0) 
		    {
		        sb.insert(i, '-');
		        i = i-K;
		    }

		    String val = sb.toString();
		    System.out.println(val);
	}
	public static void main(String args[])
	{
		licenseKey("sbjabc-a--",2);
	}
}