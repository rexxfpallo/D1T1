package Task1;

public class HCF {
	public static void main(String[] args) {
		int number1 = 90;
		int number2 = 54;
		int hcf=0;

	    for (int i = 1; i <= number1 || i <= number2; i++)
	      {
	     if (number1 % i == 0 && number2 % i == 0)
	        hcf = i;
	      }

	    System.out.println("The HCF: "+ hcf);
	  }
	}
		
		
		
		
  
