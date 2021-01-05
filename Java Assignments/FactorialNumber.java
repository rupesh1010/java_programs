import java.util.Scanner;
class FactorialNumber{
	public static void main(String args[]){
		System.out.print("Enter any Number: ");
			Scanner in=new Scanner(System.in);
			int n,fact=1;
			n=in.nextInt();
			int	i=1;
			while(i<=n)
			{
				fact=fact*i;
				i++;
			}
		System.out.println("Factorial is :"+fact);
	}
}