class balance_account
{
	public static void main(String args[])
	{
		try{
			int b=100;
			if(b<500)
				throw new balanceException();
		}
		catch(balanceException e)
		{
			System.out.println(e);
		}
	}
}
class balanceException extends Exception
{
	balanceException()
	{
		System.out.println("Low balance");
	}
}
