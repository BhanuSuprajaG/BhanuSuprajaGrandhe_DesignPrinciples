package Calculator;
	public class div implements Calci{
		public void perform_calculate(double a,double b)
		{
			if(b!=0)
				System.out.println("The Division of two numbers is "+(a/b));
			else
				System.out.println("Cannot divide by zero");
		}
	}
