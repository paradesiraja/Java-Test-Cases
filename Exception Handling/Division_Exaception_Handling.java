class Division_Exaception_Handling 
{
	public static void main(String[] args) 
	{
		try{

		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=a+b;
		if(a<=0 ){
			System.out.println("Dont pass nagative numbers and zero");
		}else
			{
			}
		System.out.println(c);
		}
		catch(ArrayIndexOutOfBoundsException e1){
			System.out.println("please enter atleast two integers "+(2+3));
		}
		catch(NumberFormatException e2){
             System.out.println("int value cannot be converting into a string "+(4+5));
		}
		catch(ArithmeticException e3){

             System.out.println("zero cannot divisible by int value "+(5+6));
		}
	}
}
