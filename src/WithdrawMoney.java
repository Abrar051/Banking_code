

public class WithdrawMoney {
	//savings
	public int withdraw (int b)
	{
		
		return b;
	}
	//credit
	public int withdraw (int withdraw, int balance)
	{
		int withdrawlimit;
		withdrawlimit = balance + balance/2 ;
		return withdrawlimit;
	}
	//debit
	public int withdraw (int withdraw , int limit , int creationTimeMoney)
	{
		if (withdraw<limit)
		{
			System.out.println ("This is debit account");
			return withdraw;
		}
		else
		{
			System.out.println ("Your balance crossed limit");
			return 0;
		}
	}
}
