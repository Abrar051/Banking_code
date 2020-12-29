import java.util.Scanner;
public class Count {
    static Scanner Withdraw = new Scanner(System.in);
	static WithdrawMoney cash = new WithdrawMoney(); 
	public static void main (String args[])
	{
		System.out.printf("Enter your withdrawal amount : ");
	    int money = Withdraw.nextInt();
		System.out.println(money);
		System.out.print("Enter your account type : 1 credit 2 debit and 3 savings  ");
		String Acctype = Withdraw.next();
		System.out.println(Acctype);
		if (Acctype == "savings")
		{
			int b = cash.withdraw (money);
			System.out.println ("This is savings account withdrawal amount is "+ b);
		}
		else if (Acctype == "credit")
		{
			System.out.println("Enter your amount to withdraw money : ");
			int b = Withdraw.nextInt();
			System.out.println ("Enter your balance : ");
			int balance = Withdraw.nextInt();
			int limit = cash.withdraw(b, balance);
			System.out.println ("This is credit account");
			System.out.println ("Withdrawal limit is : "+limit);
		}
		else if (Acctype == "debit")
		{
			System.out.println ("Enter your creation time : ");
			int year = Withdraw.nextInt();
			System.out.println("Enter your amount to withdraw money : ");
			int b = Withdraw.nextInt();
			System.out.println ("Enter your balance : ");
			int balance = Withdraw.nextInt();
			int limit = cash.withdraw(b, balance, year);
			System.out.println ("This is debit account");
		}
		else
		{
			System.out.println("Enter a valid input");
		}
	}

}
