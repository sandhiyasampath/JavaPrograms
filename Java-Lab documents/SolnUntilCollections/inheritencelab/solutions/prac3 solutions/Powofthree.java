//WAP to test whether an int input is a power of 3
public class Powofthree {


	public static void main(String[] args)
	 {
		int num=85,val=1;

		if(num<0)
		    {
			System.out.println("invalid");
			}

		if(num==1)
			{
			System.out.println ("num is power 3");
			}
		if(num>=0)
		   {
		     while(val < num)
		      {
			     val=val*3;

			      if(val==num)
			{
			System.out.println ("num is power of 3 ");
			}
	           }

	                      if(val!=num)

	                              {
									System.out.println ("num is not power of 3 ");
									}
	        }
    }
}
