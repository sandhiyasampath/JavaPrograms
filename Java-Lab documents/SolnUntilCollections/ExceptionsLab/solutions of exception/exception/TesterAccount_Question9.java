/*Create an Account. An Account has a balance (BigDecimal) and owner (String). An
Account can be used to debit(BigDecimal amt), credit(BigDecimal amt) or checkBalance()
that returns BigDecimal. Code the class with the following best practices:
a) hiding state b) exposing correct setters/getters with validation c) implement behaviours
that impact state and are impacted by state d) business methods must throw checked
exceptions for business failures*/
package uttara.solutions.exception;

import java.math.BigDecimal;

public class TesterAccount_Question9 {

	public static void main(String[] args) {
		try
		{
		BigDecimal b=new BigDecimal(1234);
		BigDecimal amt=new BigDecimal(10);
		BigDecimal draw=new BigDecimal(34);

		Account c=new Account(b,"datta");
		System.out.println(c.chkBalanace());
	  c.debit(draw);
	  System.out.println(c.chkBalanace());
	  c.credit(amt);
	  System.out.println(c.chkBalanace());
	  amt=new BigDecimal(3000);
	  c.credit(amt);
	  System.out.println(c.chkBalanace());
	  /*draw=new BigDecimal(5000);
	  c.debit(draw);*/

	 /* amt=new BigDecimal(-2);
	  c.credit(amt);*/

		}
		catch( MoneyEllaException m)
		{
			System.out.println("No Money");
			m.printStackTrace();
		}
		catch (CreditProblemException e) {
			System.out.println("Problem in credition");
			e.printStackTrace();
		}



	}

}
