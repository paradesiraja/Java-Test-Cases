class BankAccount
{
	private long accNum;
	private String accHName;
	private double balance;

	BankAccount(long accNum){
		this(accNum,null,0.0);
		System.out.println("long param constructor");
	}  
	BankAccount(long accNum,String accHName){
		this(accNum,accHName,0.0);
		System.out.println("long ,string param constructor");
	}
	BankAccount(long accNum,String accHName,double balancce){
		this.accNum=accNum;
		this.accHName=accHName;
		this.balance=balance;
		System.out.println("long ,string,double param constructor");
	}
	//public String toString(){
		//return "accNum:"+ "\n"+"accHName"+accHName+"\n"+"balance:"+balance;
	//}
}
class Test1
{


	public static void main(String[] args) 
	{
       //BankAccount a1=new BankAccount();
	   BankAccount a2=new BankAccount(1);
	   System.out.println(2);
	   BankAccount a3=new BankAccount(2,"raja");
	   System.out.println();
	   BankAccount a4=new BankAccount(2,"raja",20.11);

		System.out.println();
	}
}
