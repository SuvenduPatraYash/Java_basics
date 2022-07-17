abstract class GeneralBank
{
	abstract void getSavingInterestRate();
	
	abstract void getFixedDepositInterestRate();
	
}
class ICICIBank extends GeneralBank
{
 void getSavingInterestRate()
 {
   System.out.println("The Saving interest rate  in ICICI Bank is 4%");
 }
 void getFixedDepositInterestRate()
 {
   System.out.println("The FD interest rate in ICICI Bank is 8.5%");
 }
}
class SBIBank extends GeneralBank
{
 void getSavingInterestRate()
 {
   System.out.println("The Saving interest rate in SBIBank is 4%");
 }
 void getFixedDepositInterestRate()
 {
   System.out.println("The FD interest rate in SBIBank is 7%");
 }
}	

public class TestGeneralBank 
{

	public static void main(String[] args) 
	{
     System.out.println("Bank Detail are as follows: ");
     ICICIBank i=new ICICIBank();
     SBIBank s=new SBIBank();
     GeneralBank g=new SBIBank();
     i.getSavingInterestRate();
     s.getSavingInterestRate();
     i.getFixedDepositInterestRate();
     s.getFixedDepositInterestRate();
     g.getSavingInterestRate();
     g.getFixedDepositInterestRate();
	 	
	}

}

