package stringToInt;

public class stringToInt {
	
	public static void stringInt(String S){
		int num = 0;
		int i = 0;
		int mul = 1;
		boolean isNeg = false;
		
		int len = S.length();
		//checking if empty string is given as input
		if (len == 0)
		{
			System.out.println("Give valid string");
		}
		//checking for negative String input
		if(S.charAt(0) == '-')
		{
			isNeg = true;
			i = 1;	
		}
		//Multiplying the string characters by place values
		for(i=len-1;i>=0;i--)
		{
			num += (S.charAt(i) - '0')*mul;
			mul *= 10;
		}
		System.out.println("The integer output for the given string is" + " " + num);
	}
   public static void main(String args[])
   {
	   
	  stringInt("12345");
	   
   }
}
